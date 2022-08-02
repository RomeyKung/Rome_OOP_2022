import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        double radius, area;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
