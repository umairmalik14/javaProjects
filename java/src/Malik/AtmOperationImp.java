package Malik;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImp implements AtmOperationInterf{
    ATM atm = new ATM();
    Map<Double,String> ministat = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
     if (withdrawAmount%500==0){
         if (withdrawAmount<=atm.getBalance()){
             ministat.put(withdrawAmount,"Amount Withdrawn ");
             System.out.println("Collect the Cash "+withdrawAmount);
             atm.setBalance(atm.getBalance()-withdrawAmount);
             viewBalance();
         }
         else {
             System.out.println("Insufficient Balance !!");
         }
     }
     else{
         System.out.println("Please enter a Amount More then 500 !!");
     }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministat.put(depositAmount, "Amount Deposited  ");
        System.out.println(depositAmount+"Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministat.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
