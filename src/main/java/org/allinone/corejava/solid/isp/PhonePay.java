package org.allinone.corejava.solid.isp;

public class PhonePay implements  UPIPayment {

    @Override
    public void payMoney() {
        System.out.println("Phone Pay: Pay Money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Phone Pay: Get Scratch Card");
    }

//    @Override
//    public void getCashBackAsCreditBalance() {
//        System.out.println("Phone Pay: Get Cash Back As Credit Balance");
//        // not applicable for Phone Pay
//    }

}
