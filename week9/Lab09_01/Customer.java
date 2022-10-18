package Lab09_01;

public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer(){
        this("", "");
    }
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    public Account getAccount(int index){
        return this.acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    public String toString(){
        return this.firstName+" "+this.lastName+" has "+numOfAccount+" accounts.";
    }
}
