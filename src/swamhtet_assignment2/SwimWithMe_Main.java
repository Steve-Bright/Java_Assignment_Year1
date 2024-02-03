/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swamhtet_assignment2;

import java.util.Scanner;

public class SwimWithMe_Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Register reg = new Register();
        boolean program = true;

        while (program == true) {
            System.out.print("Enter the athlete's name: ");
            String athName = scanner.nextLine();
            reg.isReg(athName, program);

            //confirmation
            //<editor-fold>
            System.out.print("\nConfirmed?: ");
            String confirmation = scanner.nextLine();
            confirmation = confirmation.toLowerCase();

            if (confirmation.equals("yes")) {
                System.out.println("Athlete is registered.");
                program = false;
            } else {
                System.out.println("Athlete is not registered. Please try again.");
                program = true;
            }
            //</editor-fold>
        }

    }

}
