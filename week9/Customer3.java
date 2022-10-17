import java.util.ArrayList;

public class Customer3{
    private String firstName;
    private String lastName;
    ArrayList<Account> acct;
    private int numOfAccount = 0;
    

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(int index){
        return acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount += 1;
    }
    public int getNumOfAccount(){
        return acct.size();
    }

    public Customer3(){
        this.firstName = "";
        this.lastName = "";
        ArrayList<Account> acct = new ArrayList<Account>();
     }
    public Customer3(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
      acct = new ArrayList();
    }

    public String toString(){
        return "Name : "+this.getFirstName()+" LastName : "+this.getLastName()+" has "+this.getNumOfAccount()+" account.";
    }
}
