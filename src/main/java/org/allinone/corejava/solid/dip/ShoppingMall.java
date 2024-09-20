package org.allinone.corejava.solid.dip;

public class ShoppingMall {

   // private CreditCard creditCard;
   // private DebitCard debitCard;

    private BankCard creditCard;




/*    public ShoppingMall(CreditCard creditCard, DebitCard debitCard) {
        this.creditCard = creditCard;
        this.debitCard = debitCard;
    }*/

    public ShoppingMall(BankCard creditCard) {
        this.creditCard = creditCard;
    }

    public void purchaseUsingCreditCard(long amount) {
        creditCard.doTransaction(amount);
    }

//    public void purchaseUsingDebitCard(long amount) {
//        debitCard.doTransaction(amount);
//    }


public String toString() {
    return "ShoppingMall{" +
            "creditCard=" + creditCard +
            '}';
}

    public static void main(String[] args) {
        BankCard creditCard = new CreditCard();
        //DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(creditCard);
        shoppingMall.purchaseUsingCreditCard(1000);
        //shoppingMall.purchaseUsingDebitCard(500);
        System.out.println("Hello World" + shoppingMall);
    }
}
