
package swamhtet_assignment2;

import java.util.ArrayList;


public class Stored_values {

        int duration;
        
        //regestered Names
        ArrayList<String> regedNames = new ArrayList(){
            {
                add("Myat Phone");
                add("Lin Htet");
                add("Kaung Myat");
                add("Maung Maung");
            }
        };
        
        //registered Plans
        ArrayList<String> regedPlans = new ArrayList(){
            {
                add("basic");
                add("intermediate");
                add("elite");
                add("intermediate");
            }
        };
        
        //registered current weight
        ArrayList<Double> regedWeight = new ArrayList(){
            {
                add(60.2);
                add(75.0);
                add(90.7);
                add(67.8);
            }
        };
        
        //number of competiton
        ArrayList<Integer> noOfCom = new ArrayList(){
            {
                add(0);
                add(0);
                add(5);
                add(1);
            }
        };
        
        //competition ans
        ArrayList<String> comAns = new ArrayList(){
            {
                add("no");
                add("yes");
                add("yes");
                add("no");
            }
        };
        
        //competition category
        ArrayList<String> comCategory = new ArrayList(){
            {
                add("Unregistered");
                add("Light");
                add("Light-Heavy");
                add("Light");
            }  
        };
        
        //competition private Hours
        ArrayList<Integer> comPrivateHours = new ArrayList(){
            {
                add("2");
                add("4");
                add("4");
                add("0");
            }
        };
        
        //competition number of Months
        ArrayList<Integer> noOfMonths = new ArrayList(){
            {
                add(2);
                add(4);
                add(12);
                add(1);
            }
        };
        
        //registered plan fees
        ArrayList<Double> regedPlanFees = new ArrayList(){
            {
                add(40);
                add(140);
                add(600);
                add(35);
            }
        };
        
        //competition Fees
        ArrayList<Double> regedComFees = new ArrayList(){
            {
                add(0);
                add(100);
                add(300);
                add(0);
            }
        };
        
        //Private Hours Fees
        ArrayList<Double> regedPrivateFees = new ArrayList(){
            {
                add(168);
                add(672);
                add(2016);
                add(0);
            }
        };
        
        //Total Fees
        ArrayList<Double> regedTotal = new ArrayList(){
            {
                add(208);
                add(912);
                add(2916);
                add(35);
            }
        };
}
