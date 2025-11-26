package homeWork;

import java.util.Scanner;

public class coffeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 0;
        double finalPrice  = 0;
        double discountAmount = 0;
        double tax = 0;

        System.out.println(
                "1 - Kapuçino 7.3 ₼\n" +
                "2 - Latte 7.3 ₼\n" +
                "3 - Amerikano 6.4 ₼\n" +
                "4 - Espresso 4.5 ₼\n" +
                "5 - Flat White 6.3 ₼\n" +
                "6 - Mocha 8.5 ₼\n" +
                "7 - Macchiato 6 ₼\n" +
                "Sifariş üçün seçim edin (1-7 aralığında rəqəm daxil etməklə)");

        int coffe =  sc.nextInt();
        System.out.println("Endirim üçün yaşınızı daxil edin.");
        int age =  sc.nextInt();

        switch (coffe) {
            case 1:
                price = 7.3;
                break;
            case 2:
                price = 7.5;
                break;
            case 3:
                price = 6.4;
                break;
            case 4:
                price = 4.5;
                break;
            case 5:
                price = 6.3;
                break;
            case 6:
                price = 8.5;
                break;
            case 7:
                price = 6;
                break;
            default:
                System.out.println("Seçimi düzgün etmədiniz...");
        }

        if (age < 13) {
            tax = 40;
        } else if (age <= 17 && age >= 13) {
            tax = 20;
        } else if (age >= 65) {
            tax = 30;
        } else {
            tax = 0;
        }

        finalPrice = Math.round((price - price * tax/100)* 100.0) / 100.0;
        discountAmount = Math.round((price - finalPrice)* 100.0) / 100.0;


        System.out.println("Yekun məbləğ " + finalPrice   + " ₼ təşkil edir." );
        System.out.println("Endirim " +  discountAmount + " ₼ təşkil edir." );
    }
}

