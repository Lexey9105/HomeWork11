public class Main {
    public static void main(String[] args) {
task();
    }

    public static void printLeapYear(int i) {

            if (i%4==0&&i%100!=0||i%400==0&&i%4==0) {
                System.out.println(i+" Является високосным");
            }  else {System.out.println(i+" Является невисокосным");}

    }

    public static void printOS(int i, int y) {
        if (i == 0 && y >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (i == 0 && y < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (i == 1 && y >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (i == 1 && y < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (i > 1 && i < 0) {
            throw new RuntimeException("Некоректная версия OS");
        }
    }

    public static void printDelivery(int i, int y) {
        if (i > 0 && i <= 20) {
            y = y + 1;
            System.out.println("Потребуется дней: " + y);
        }
        if (i > 20 && i < 60) {
            y = y + 2;
            System.out.println("Потребуется дней: " + y);
        }
        if (i >= 60 && i < 100) {
            y = y + 3;
            System.out.println("Потребуется дней: " + y);
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void task(){
        int leapYear=1780;
        int clientOS=0;
        int clientDeviceYear=2016;
        int deliveryDistance=65;
        int days=0;
        printLeapYear(leapYear);
        printOS(clientOS,clientDeviceYear);
        printDelivery(deliveryDistance,days);
    }
}





