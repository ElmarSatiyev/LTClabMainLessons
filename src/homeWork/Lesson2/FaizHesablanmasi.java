package homeWork.Lesson2;

import java.util.Scanner;

public class FaizHesablanmasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Əsas məbləğ (AZN): ");
        double esas_mebleg = input.nextDouble();
        System.out.println("İllik faiz dərəcəsi (%): ");
        double illik_faiz_derecesi  = input.nextDouble();
        System.out.println("İllərin sayı: ");
        double illerin_sayi =  input.nextDouble();

        double yekun_mebleg = esas_mebleg * Math.pow((1+(illik_faiz_derecesi/100)),illerin_sayi);
        long yekun_mebleg_int = Math.round(yekun_mebleg);


        System.out.printf("%.2f",yekun_mebleg);
        System.out.println(yekun_mebleg_int);






    }
}
