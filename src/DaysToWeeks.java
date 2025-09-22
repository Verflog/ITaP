import java.util.Scanner;

public class DaysToWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = scanner.nextInt();
        System.out.println(daysToWeeks(numberOfDays));
    }

    public static String daysToWeeks(int n) {
        int w = n / 7;
        int d = n % 7;
        String text1;
        String text2;

        if (w % 10 == 0 || w % 10 >= 5 || (w >= 11 && w <= 19)) {
            text1 = " недель";
        } else if (w % 10 >= 2 && w % 10 <= 4 ) {
            text1 = " недели";
        }else {
            text1 = " неделя";
        }

        if (d == 1) {
            text2 = " день";
        }else if (d >= 2 && d <= 4) {
            text2 = " дня";
        } else {
            text2 = " дней";
        }

        return w + text1 + " и " + d + text2;
    }
}
