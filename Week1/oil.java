import java.util.*;

public class oil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double liter = sc.nextInt(), cost;
        cost = liter * 30;
        System.out.println("Price is "+ cost + "Bath");
        sc.close();
    }
}
