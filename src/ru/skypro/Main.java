package ru.skypro;

class Homework {
// Задание 1
    public static void main(String[] args) {

        isYearLeap(2012);
        clientDevice(2020,1);
        deliveryTime(95);

    }

    public static void isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    // Задание 2
    public static void clientDevice(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2022 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2022 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2022 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2022 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }
// Задание 3
    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: 3");
        }
        return deliveryTime;
    }
}
