import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = 0;
        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int numberDays = scanner.nextInt();
            int actualNumberDays = determineYearType(year);
            if (actualNumberDays == numberDays) {
                totalPoints++;
            } else {
                System.out.println("Неправильно! В этом году " + actualNumberDays + " дней!");
                System.out.println("Набрано очков: " + totalPoints);
                break;
            }
        }
    }

    public static int determineYearType(int year) {
        int actualNumberDays;
        if (year % 400 == 0) {
            actualNumberDays = 366;
        } else if (year % 100 == 0) {
            actualNumberDays = 365;
        } else if (year % 4 == 0) {
            actualNumberDays = 366;
        } else {
            actualNumberDays = 365;
        }
        return actualNumberDays;
    }
}