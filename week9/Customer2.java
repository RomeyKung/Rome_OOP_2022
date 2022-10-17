
public class Customer2 {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Customer2() {
        this.firstName = "";
        this.lastName = "";
        acct = new Account[5];
    }
    public Customer2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
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
        return acct[index];
    }

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }


    public String toString() {
        return "Name : " + this.getFirstName() + " LastName : " + this.getLastName() + " has " + this.getNumOfAccount()
                + " account.";
    }
}
