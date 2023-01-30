package com.Questions.Four_Enhanced;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.03);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after first month: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance after first month: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 balance after second month: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2 balance after second month: $" + saver2.getSavingsBalance());
    }
}

