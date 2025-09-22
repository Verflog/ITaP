import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int f = toFahrenheit(c);
        System.out.println(f);
    }

    public static int toFahrenheit(int c) {
        return c * 9 / 5 + 32;
    }
}
