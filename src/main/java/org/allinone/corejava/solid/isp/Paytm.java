package org.allinone.corejava.solid.isp;

public class Paytm implements UPIPayment {

    @Override
    public void payMoney() {
        System.out.println("Paytm: Pay Money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Paytm: Get Scratch Card");
    }

//    @Override
//    public void getCashBackAsCreditBalance() {
//        System.out.println("Paytm: Get Cash Back As Credit Balance");
//        // not applicable for Paytm
//    }

}
