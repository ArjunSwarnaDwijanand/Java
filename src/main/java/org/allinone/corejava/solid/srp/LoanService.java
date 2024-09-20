package org.allinone.corejava.solid.srp;

public class LoanService {

    public void getLoanInterestInfo(String loanType) {

        switch (loanType) {
            case "Home Loan":
                System.out.println("Home Loan Interest Rate: 8.5%");
                break;
            case "Car Loan":
                System.out.println("Car Loan Interest Rate: 9.5%");
                break;
            case "Personal Loan":
                System.out.println("Personal Loan Interest Rate: 10.5%");
                break;
            default:
                System.out.println("Loan Type not found!");
                break;
        }

    }
}
