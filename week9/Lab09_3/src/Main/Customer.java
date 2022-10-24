package Main;
import java.util.*;
public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList acct;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return (Account)this.acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }

    public String toString() {
       return this.firstName+" "+this.lastName;
    }

}
