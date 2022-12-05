package Malik;
// validation the user through ATM number and pin.
// User should able to perform below operation
    //1. check Available  balance
    //2. Withdraw Amount
    //3. Deposit Amount
    //4. View Mini Statement
    //5. Exit

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AtmOperationInterf op= new AtmOperationImp();

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        int atmnumber= 984567;
        int atmpin = 123456;
        System.out.print("Enter ATM Number : ");
        int AtmNUmber = in.nextInt();
        System.out.print("Enter Pin : ");
        int Pin = in.nextInt();

        if ((atmnumber==AtmNUmber)&&(atmpin==Pin)){

            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch= in.nextInt();
                if (ch==1){
                    op.viewBalance();

                }
                else if (ch==2){
                    System.out.println("Enter Amount Withdrawn : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch==3){
                    System.out.println("Enter Amount Deposit : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (ch==4){
                    op.viewMiniStatement();
                }
                else if (ch==5){
                    System.out.println("Collect Your ATM Card\n Thank you Using ATM Machine");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please correct Choice");
                }
            }
        }
        else {
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }


    }
}
