import java.util.*;

public class vat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        System.out.println("Price = "+(cost*1.07));
        sc.close();
    }
}
