package org.allinone.corejava.solid.srp;

public class NotificationService {

    public void sendOTPEquals(String medium) {

        if(medium.equals("Email")) {
            System.out.println("OTP sent to your Email ID");
        } else if(medium.equals("Mobile")) {
            System.out.println("OTP sent to your Mobile Number");
        } else {
            System.out.println("Invalid OTP Medium");
        }

    }

    //above code convert to java 8

    public void sendOTPSwitch(String medium) {
        switch (medium) {
            case "Email":
                System.out.println("OTP sent to your Email ID");
                break;
            case "Mobile":
                System.out.println("OTP sent to your Mobile Number");
                break;
            default:
                System.out.println("Invalid OTP Medium");
                break;
        }
    }
}
