import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        isLeapYear(1604);
        appVersion(1, 2024);
        System.out.println("Потребуется дней: " + calculateDaysToDeliver(101));
    }

    // Задача 1
    public static void isLeapYear(int year) {
        if (year < 1584) {
            System.out.println("Простите, господин, наши ученые еще не придумали високосный год");
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    // Задача 2
    public static void appVersion(int clientOS, int yearOfProduction) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0: // iOS
                if (yearOfProduction < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1: // Android
                if (yearOfProduction < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default: // Symbian, Windows mobile и прочие
                System.out.println("К сожалению, экзотические ОС не временно не поддерживаются");
        }
    }

    // Задача 3
    public static int calculateDaysToDeliver(int distance) {
        byte daysToDeliver;
        if (distance < 20) {
            daysToDeliver = 1;
        } else if (distance > 20 && distance <= 60) {
            daysToDeliver = 2;
        } else if (distance > 60 && distance <= 100) {
            daysToDeliver = 3;
        } else daysToDeliver = -1; // будем считать, что столько дней не бывает, значит и доставки нет
        System.out.println("Так далеко не возим");
        return daysToDeliver;
    }
}