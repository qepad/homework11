import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        task1();
        getLeapYear(2024);
        task2();
        getAppVersion(0, 2020);
        task3();
        System.out.println("Количество дней доставки: " + getDeliveryTime(95));

    }

    // task 1

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void getLeapYear(int year) {

        int currentYear = LocalDate.now().getYear();
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year <= 1584) {
            System.out.println("Високосный год был введен в 1584 г");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }


    // task 2

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void getAppVersion(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС невозможно определить");
        }
    }


    // task 3

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static int getDeliveryTime(int deliveryDistance) {

        int deliveryTime;

        if (deliveryDistance > 0 && deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
        }

        return deliveryTime;

    }
}