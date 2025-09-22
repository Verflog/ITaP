import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int avg = average(a, b, c);
        System.out.println(avg);
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}
