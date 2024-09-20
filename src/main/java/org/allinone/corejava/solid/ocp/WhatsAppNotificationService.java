package org.allinone.corejava.solid.ocp;

public class WhatsAppNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        if(medium.equals("WhatsApp")) {
            System.out.println("OTP sent to your WhatsApp Number");
        } else {
            System.out.println("Invalid OTP Medium");
        }
    }

    @Override
    public void sendTransactionReport(String medium) {
        if(medium.equals("WhatsApp")) {
            System.out.println("Transaction Report sent to your WhatsApp Number");
        }  else {
            System.out.println("Invalid Transaction Report Medium");
        }
    }
}
