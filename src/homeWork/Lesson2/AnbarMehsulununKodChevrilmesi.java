package homeWork.Lesson2;

import java.util.Scanner;

public class AnbarMehsulununKodChevrilmesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anbar kodunu daxil edin: ");
        String anbar_kodu = input.nextLine();

        char kod_herfi =  anbar_kodu.charAt(1);
        int ascii_deyeri = (int) kod_herfi;
        System.out.println(ascii_deyeri);

        int tehlukesizlik_kodu = (int) (ascii_deyeri / 32 - 10);
        System.out.println(tehlukesizlik_kodu);
    }
}
