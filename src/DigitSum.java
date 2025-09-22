import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.toString();
        int sum = digitSum(num);
        System.out.println(sum);
    }

    public static int digitSum(String num) {
        int sum = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            sum += num.charAt(i) - '0'; // here I use - '0' to shift from char to integer
        }
        return sum;
    }
}
