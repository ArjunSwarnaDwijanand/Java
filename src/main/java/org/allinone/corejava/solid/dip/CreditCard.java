package org.allinone.corejava.solid.dip;

public class CreditCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("Credit Card: Do Transaction");
    }
}
