import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(checkAge(age));
    }

    public static String checkAge(int n) {
        String check;
        if (n > 0 && n < 18) {
            check = "несовершеннолетний";
        } else if (n >= 18) {
            check = "совершеннолетний";
        }else {
            check = "данные введены неверно";
        }
        return check;
    }
}
