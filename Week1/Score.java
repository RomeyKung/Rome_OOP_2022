import java.util.*;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt(), y = sc.nextInt() , z = sc.nextInt();
        System.out.println((x+y+z)/3);
        sc.close();
    }
}
