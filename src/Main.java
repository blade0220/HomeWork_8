import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2020);
        getdeviceLink (1, 2018);
        int deliveryDays = calculateDeliveryDays(60);
        System.out.println("Потребуется дней " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        System.out.println("Задача_1");

        //int years = 2021;
        //int a = years % 4;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " является высокосным");
        } else {
            System.out.println(year + " не высокосный");
        }

    }
    public static void getdeviceLink(int clientOS, int clientDeviceYear) {
        System.out.println("");
        System.out.println("Задача_2");
        //   int clientOS = 1;
        // int clientDeviceYear = 2016;
        //if (clientOs != 0 && clientOs != 1) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear <= 0){
            System.out.println("Некорректное значение года. Введите другой год.");
            return;
        }
        if (clientOS != 0 && clientOS !=1){
            System.out.println("Не удается идентифицировать ОС");
            return;
        }
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для OS Android по ссылке");
            } else {
                //System.out.println("Установите версию приложения для iOS по ссылке");
                System.out.println("Установите версию приложения для OS Android по ссылке");

            }
        }

    }
    public static int calculateDeliveryDays(int deliveryDistance){
        System.out.println("");
        System.out.println("Задача_3");
        if (deliveryDistance <= 20){
           return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }

}