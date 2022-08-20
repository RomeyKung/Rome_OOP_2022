import java.util.*;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt(), min = sc.nextInt();
        System.out.println("Secs = "+(hr*3600+min*60));
        sc.close();
    }
}
