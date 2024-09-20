package org.allinone.corejava.solid.srp;

public class BankServices {

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void transfer(double amount) {

    }

    public void openAccount() {

    }

    public void closeAccount() {

    }


    public void getFixedDepositInterestInfo(String depositType) {

        if(depositType.equals("1 Year")) {
            System.out.println("1 Year Fixed Deposit Interest Rate: 6.5%");
        } else if(depositType.equals("2 Year")) {
            System.out.println("2 Year Fixed Deposit Interest Rate: 7.5%");
        } else if(depositType.equals("3 Year")) {
            System.out.println("3 Year Fixed Deposit Interest Rate: 8.5%");
        } else {
            System.out.println("Deposit Type not found!");
        }

    }


}
