package org.allinone.corejava.solid.dip;

public class DebitCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("Debit Card: Do Transaction");
    }

}
