package homeWork.Lesson3;

import java.util.Scanner;

public class NationalPark {
    public static void main(String[] args) {

        System.out.println("---Milli Parka Xoş Gəlmisiniz---");
        System.out.println("Zəhmət olmaza seçiminizi edin.");
        System.out.println(" 1-Hiking, 2-Camping, 3-Biking");


        Scanner sc = new Scanner(System.in);
        int choise =  sc.nextInt();

        if (choise == 1) {
            System.out.println("Heç bir endirim yoxdur.");
        } else if (choise == 2) {
            System.out.println("Çadır ləvazimatlarına 15% endirim.");
        } else if (choise == 3) {
            System.out.println("Velosiped icarəsinə 25% endirim.");
        } else {
            System.out.println("Seçim düzgün deyil...");
        }

        System.out.println("Zəhmət olmaza marşrut seçiminizi edin.");
        System.out.println(" 1 - A-B, 2 - A-C, 3 - A-D, 4 - A-E");
        int choiseRoute =  sc.nextInt();

        switch (choiseRoute) {
            case 1:
                System.out.println("Asan rota");
                break;
            case 2:
                System.out.println("Orta rota");
                break;
            case 3:
                System.out.println("Çətin rota");
                break;
            case 4:
                System.out.println("Daha çətin rota");
                break;
            default:
                System.out.println("Yanlış marşrut seçimi ");
        }
    }
}
