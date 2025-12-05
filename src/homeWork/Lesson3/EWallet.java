package homeWork.Lesson3;

import java.util.Scanner;

public class EWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cari balans nə qədərdir (AZN)?");
        double currentBalance = sc.nextDouble();

        if (currentBalance < 100) {
            System.out.println("Balans aşağıdır. Əlavə edin və 5% bonus qazanın.");
        } else if (currentBalance <= 100 && currentBalance >= 500) {
            System.out.println("Balans stabildir. Bütün əməliyyatlar sığortalanır.");
        } else {
            System.out.println("Siz VIP müştərisiniz! Bütün köçürmələr pulsuzdur.");
        }

        System.out.println("1-Pul Köçürmə, 2-Balans Artırma, 3-Hesab Ödənişi, 4-Qızıl Alma");
        System.out.println("1-4 aralığında bir əməliyyat seçin.");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Pul köçürmə əməliyyatlarına xoş gəldiniz.");
                break;
            case 2:
                System.out.println("Balans artırma əməliyyatlarına xoş gəlmisiniz.");
                break;
            case 3:
                System.out.println("Hesab ödənişi əməliyyatlarına xoş gəlmisiniz.");
                break;
            case 4:
                System.out.println("Qızıl alma əməliyyatlarına xoş gəlmisiniz.");
                break;
            default:
                System.out.println("Düzgün seçim etmədiniz..");
        }

    }
}
