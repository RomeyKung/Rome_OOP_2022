package lab010_2;

public class Main {

    public static void main(String[] args) {
//        CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
//        Customer cust = new Customer("Sompong", "Sookjai", acct1);
//        cust.getAcct().deposit(500);
//        cust.getAcct().withdraw(1800);
//        cust.getAcct().withdraw(300);
//        cust.getAcct().deposit(1000);
//        cust.getAcct().withdraw(200);
//run ไม่ผ่านเพราะว่า ในการเรียกใช้ withdraw ใน checkingAccount มี throws ว่า
//อาจมี error เกิดขึ้น ดังนั้นจึงต้องใช้ try/catch ดัง error ที่จะเกิด
        try {
            CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
            Customer cust = new Customer("Sompong", "Sookjai", acct1);
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Thank you.");
        }

    }

}
