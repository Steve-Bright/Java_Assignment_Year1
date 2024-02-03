
package swamhtet_assignment2;


import java.util.Scanner;

public class Register {
    //class and variable definition
    //<editor-fold>
    Stored_values values = new Stored_values();
    BubbleSort sorting = new BubbleSort();
    BinarySearch searching = new BinarySearch();
    Scanner scanner = new Scanner(System.in);
    
    String weightCat, ans = "no", plan;
    int weekFee, comFee, noOfCom, limit, privateHours, noOfMonth, totalWeek;
    double totalPlanFee, totalComFee, totalPrivateFee;
    double total, diffWeight, weight;
    boolean comJoin, privateC;
    boolean comAsk = false, program = false;
    boolean planloop = false, weightloop = false, comCatAsk = false;
    //</editor-fold>
    
    //isReg - check whether name is registered or not
    void isReg(String name, boolean program) throws InterruptedException{
        
        sorting.bubbleSort(values.regedNames);      //sort to binarySearch
        int res = searching.binarySearch(values.regedNames, name);
        
        if(res == -1){
            this.toReg(name, program);              //register it if there isn't
            this.toSaveData();
        }
        else{
            System.out.println("This person is already registered.");
          
        }
    }
    
    //toReg - register member if not registered
    void toReg(String name, boolean program) throws InterruptedException{ 
        
        //add new name to array
        //<editor-fold>
        values.regedNames.add(name);                    
        System.out.println( "Registering new member: " + name);
        for(int i = 0; i <10; i++){
            //loading screen
            System.out.print(".");                      
            Thread.sleep(300);
        }
        //</editor-fold>
      
        //ask for plan
        //<editor-fold>
        do{
            System.out.print("\nEnter the plan: ");         

            plan = scanner.next();
            plan = plan.toLowerCase();
            
            switch(plan){
            //plan condition
            case "beginner":    planloop = true;
                                weekFee = 20;
                                break;
                             
            case "intermediate": planloop = true;
                                 weekFee = 35;
                                 comAsk = true;
                                 comJoin = false;
                                 break;
                                
            case "elite":   planloop = true;
                            weekFee = 50;
                            comAsk = true;
                            comJoin = false;
                            break;
                            
            default: planloop = false;
                     System.out.println("Invalid Input");
                           
        }
        }while(planloop == false);
        
        //</editor-fold>
        
        //ask for currentWeight
        //<editor-fold>
        do{
            System.out.print("Current Weight: ");           
            weight = scanner.nextDouble();
            scanner.nextLine();

            if(weight < 0){
                System.out.println("Invalid input! ");
                weightloop = false;
            }
            else{
                weightloop = true;
            }
        }while(weightloop == false);
        //</editor-fold>
        
        //ask for competition
        //<editor-fold>
        while(comAsk == true){ 
            
                while(comCatAsk == false){
                    System.out.println("heavy = 1, light-heavy = 2, middle = 3,"
                                      +" light-middle = 4, light = 5, fly = 6");
                    System.out.print("Competition Weight Category: ");
                    weightCat = scanner.next();
                    scanner.nextLine();
                
                    switch(weightCat){
                    case "1":   limit = 130;
                                comCatAsk = true;
                                weightCat = "Heavy";
                                break;
                              
                    case "2":   limit = 100;
                                comCatAsk = true;
                                weightCat = "Light-Heavy";
                                break;
                                
                    case "3":   limit = 90;
                                comCatAsk = true;
                                weightCat = "Middle";
                                break;
                                
                    case "4":   limit = 81;
                                comCatAsk = true;
                                weightCat = "Light-Middle";
                                break;
                                
                    case "5":   limit = 73;
                                comCatAsk = true;
                                weightCat = "Light";
                                break;
                    
                    case "6":   limit = 66;
                                comCatAsk = true;
                                weightCat = "Fly";
                                break;
                                
                    default:    comCatAsk = false;
                                System.out.println("Please enter the valid Training Plan again!");
                                System.out.println("....................");
                    }
                    
                }
                    if(comJoin == false){
                        System.out.println("Will you take part in upcoming competition? ");
                        ans = scanner.nextLine();
                        ans = ans.toLowerCase();
                        
                        System.out.print("Number of competitions entered: ");
                        noOfCom = scanner.nextInt();
                        scanner.nextLine();

                        if(ans.equals("yes")){
                            comFee = 25;
                            comJoin = true;
                            comAsk = false;
                        }
                        else{
                            comFee = 0;
                            comJoin = true;
                            comAsk = false;
                        }
                    }
            }
        
            //</editor-fold>
        
        //private-coaching 
        //<editor-fold>
        System.out.print("Do you want Private Coaching?");
        String ansP = scanner.next();
        scanner.nextLine();
        ansP = ansP.toLowerCase();
        
        switch(ansP){
            case("yes"):privateC = false; 
                        while(privateC == false){
                            System.out.print("Number of private hours per week");
                            privateHours = scanner.nextInt();
                            
                            if(privateHours > 5){
                            privateC = false;
                            System.out.println("Private coaching must not exceed 5 hours");
                            }
                            else if(privateHours <= 0){
                                privateC = false;
                                System.out.println("Please enter the valid Hours");
                            }
                            else{
                                privateC = true;
                            }
                            
                        }
                        break;
                        
            case("no"): privateHours = 0;   
        }//</editor-fold>
        
        //time-month
        System.out.print("Number of Months for registration: ");
        noOfMonth = scanner.nextInt();
        totalWeek = noOfMonth * 4;
        
        //total-price
        totalPlanFee = (weekFee * totalWeek);
        totalPrivateFee = (totalWeek * privateHours * 10.5);
        totalComFee = (comFee * noOfMonth);
        total = totalPlanFee + totalPrivateFee + totalComFee;
        
        if(weight > limit){
            diffWeight = weight - limit;
        }
        else{
            diffWeight = limit - weight;
        }
        
        System.out.println("Please check the information. "
                + "\n........................."); 
        toDisplay(name, plan, weight, noOfCom, weightCat, privateHours, noOfMonth);
        System.out.println("........................");
        
    }
    
    //toDisplay to display the info
    void toDisplay(String athleteName, String plan, double weight, int noOfCom,
                    String weightCat, int privateHours, int noOfMonths){
        System.out.println("Athlete Name: " + athleteName);
        System.out.println("Plan: " + plan);
        System.out.println("Current Weight: " + weight);
        System.out.println("Number of Competitions entered: " + noOfCom);
        switch(ans){
            case("yes"): System.out.println("This athlete will join competition."); 
                        break;
            case("no"): System.out.println("This athlete will not join competition.");
                        break;
        }
        
        if(weightCat == null){
            System.out.println("Competiton Weight Category: Unregistered");
        }
        else{
            System.out.println("Competiton Weight Category: " + weightCat);
            System.out.println("Difference between your weight and category: " + diffWeight);
        }
        
        System.out.println("Private Coaching: " + privateHours);
        System.out.println("Number of Months: " + noOfMonths);
        
        System.out.println("---Price List---");
        System.out.printf("Plan Fee: %.2f ("+weekFee+"$ per week) \n ", totalPlanFee);
        System.out.printf("Competition Fee: %.2f ("+comFee+"$ per competition) \n", totalComFee);
        System.out.printf("Private Hours Fee: %.2f (10.5 $ per 1 hour.) \n",totalPrivateFee);
        System.out.printf("Total Fees: %.2f $",total);
        
    }
    
    void toSaveData(){
        
        values.regedPlans.add(plan);
        values.regedWeight.add(weight); 
        values.comAns.add(ans);
        values.comCategory.add(weightCat);                
        values.noOfCom.add(noOfCom);
        values.comPrivateHours.add(privateHours);
        values.noOfMonths.add(noOfMonth);
        values.regedPlanFees.add(totalPlanFee);
        values.regedPrivateFees.add(totalPrivateFee);
        values.regedComFees.add(totalComFee);
        values.regedTotal.add(total);
    }
}
