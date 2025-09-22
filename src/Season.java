import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(season(n));
    }

    public static String season(int n) {
        switch (n) {
            case 1, 2, 12:
                return "зима";
            case 3, 4, 5:
                return "весна";
            case 6, 7, 8:
                return "лето";
            case 9, 10, 11:
                return "осень";
            default:
                return "данные введены неверно";
        }
    }
}
