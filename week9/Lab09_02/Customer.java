package Lab09_02;

import Lab09_00.Account;
import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public Account getAccount(int index){
        return (Account)this.acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return acct.size();
    }
    public String toString(){
        return this.firstName+" "+this.lastName+" has "+acct.size()+" account.";
    }
}
