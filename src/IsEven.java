import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
