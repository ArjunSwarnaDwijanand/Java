package org.allinone.corejava.solid.srp;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Double> accounts = new HashMap<>();

    public void deposit(double amount) {
        // Deposit the amount
        String accountNumber = "1234567890"; // Example account number
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
        System.out.println("Deposited " + amount + " to account " + accountNumber);
    }

    public void withdraw(double amount) {
        // Withdraw the amount
        String accountNumber = "1234567890"; // Example account number
        if (accounts.getOrDefault(accountNumber, 0.0) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    public void transfer(double amount) {
        // Transfer the amount
        String fromAccount = "1234567890"; // Example from account number
        String toAccount = "0987654321"; // Example to account number
        if (accounts.getOrDefault(fromAccount, 0.0) >= amount) {
            accounts.put(fromAccount, accounts.get(fromAccount) - amount);
            accounts.put(toAccount, accounts.getOrDefault(toAccount, 0.0) + amount);
            System.out.println("Transferred " + amount + " from account " + fromAccount + " to account " + toAccount);
        } else {
            System.out.println("Insufficient balance in account " + fromAccount);
        }
    }

    public void openAccount() {
        // Open an account
        String accountNumber = "1234567890"; // Example account number
        accounts.put(accountNumber, 0.0);
        System.out.println("Account " + accountNumber + " opened successfully!");
    }

    public void closeAccount() {
        // Close an account
        String accountNumber = "1234567890"; // Example account number
        accounts.remove(accountNumber);
        System.out.println("Account " + accountNumber + " closed successfully!");
    }

    public void printPassbook() {
        // Print the passbook
        String accountNumber = "1234567890"; // Example account number
        System.out.println("Passbook for account " + accountNumber + ":");
        System.out.println("Balance: " + accounts.getOrDefault(accountNumber, 0.0));
    }

    public void getLoanInterestInfo(String loanType) {

        if (loanType.equals("home")) {
            getHomeLoanInterestInfo();
        } else if (loanType.equals("car")) {
            getCarLoanInterestInfo();
        } else if (loanType.equals("personal")) {
            getPersonalLoanInterestInfo();
        } else {
            System.out.println("Invalid loan type!");
        }

    }

    //above code convert to java 8


    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            sendEmailOTP();
        } else if (medium.equals("sms")) {
            sendSMSOTP();
        } else if (medium.equals("whatsapp")) {
            sendWhatsAppOTP();
        }else {
            System.out.println("Invalid medium!");
        }

    }

    private void sendWhatsAppOTP() {
        // Send OTP via WhatsApp
        System.out.println("OTP sent via WhatsApp!");
    }

    private void sendSMSOTP() {
        // Send OTP via SMS
        System.out.println("OTP sent via SMS!");
    }

    private void sendEmailOTP() {
        // Send OTP via email
        System.out.println("OTP sent via email!");
    }

    private void getPersonalLoanInterestInfo() {
        // Get personal loan interest information
        double principal = 2000; // Principal amount
        double rate = 10.0; // Interest rate
        int time = 2; // Time in years

        double interest = (principal * rate * time) / 100;
        System.out.println("Personal Loan Interest Information: " + interest);

    }

    private void getCarLoanInterestInfo() {
        // Get car loan interest information
        double principal = 5000; // Principal amount
        double rate = 7.5; // Interest rate
        int time = 3; // Time in years

        double interest = (principal * rate * time) / 100;
        System.out.println("Car Loan Interest Information: " + interest);
    }


    private void getHomeLoanInterestInfo() {
        // Get home loan interest information
        double principal = 10000; // Principal amount
        double rate = 5.5; // Interest rate
        int time = 5; // Time in years

        double interest = (principal * rate * time) / 100;
        System.out.println("Home Loan Interest Information: " + interest);
    }
}