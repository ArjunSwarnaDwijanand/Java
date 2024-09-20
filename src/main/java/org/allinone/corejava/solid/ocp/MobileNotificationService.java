package org.allinone.corejava.solid.ocp;

public class MobileNotificationService implements NotificationService {

    @Override
    public void sendOTP(String medium) {
        //twillo API
        if(medium.equals("Mobile")) {
            System.out.println("OTP sent to your Mobile Number");
        } else {
            System.out.println("Invalid OTP Medium");
        }
    }

    @Override
    public void sendTransactionReport(String medium) {
        if(medium.equals("Mobile")) {
            System.out.println("Transaction Report sent to your Mobile Number");
        }  else {
            System.out.println("Invalid Transaction Report Medium");
        }
    }
}
