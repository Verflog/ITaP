import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = rectangleArea(a, b);
        System.out.println(c);
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }
}
