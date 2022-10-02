/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rome
 */
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
        credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void withdraw(double a) {
        if ((a > 0) && ((balance - a) > 0)) {
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + this.credit + ".");
        } else if (balance - a + this.credit >= 0) {
            balance = 0;
            this.credit -= a - balance;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + this.credit + ".");
        } else if (balance - a < 0) {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        double b = Double.parseDouble(a);
        withdraw(b);
    }

    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
