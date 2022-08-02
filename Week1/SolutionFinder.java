public class SolutionFinder {
    public static void main(String[] args) {
        double a = 4d, b = 8d, c = 3d, x1, x2;
        x1 = (-b + Math.sqrt((b*b) - 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt((b*b) - 4*a*c)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
