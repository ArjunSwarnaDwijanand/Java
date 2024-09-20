package org.allinone.corejava.solid.ocp;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        if(medium.equals("Email")) {
            System.out.println("OTP sent to your Email ID");
        } else {
            System.out.println("Invalid OTP Medium");
        }
    }

    @Override
    public void sendTransactionReport(String medium) {
        if(medium.equals("Email")) {
            System.out.println("Transaction Report sent to your Email ID");
        }  else {
            System.out.println("Invalid Transaction Report Medium");
        }
    }
}
