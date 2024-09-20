package org.allinone.corejava.solid.isp;

public class GooglePay implements UPIPayment,CashBackManager {

    @Override
    public void payMoney() {
        System.out.println("Google Pay: Pay Money");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Google Pay: Get Scratch Card");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Google Pay: Get Cash Back As Credit Balance");
    }

}
