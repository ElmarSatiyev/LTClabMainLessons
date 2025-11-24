package homeWork;

import java.util.Scanner;

public class SaniyeleriZamanaChevirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesablacaq müddəti daxil edin (saniyə): ");
        long toplam_saniye = input.nextLong();

        int saat = (int) (toplam_saniye / 3600);
        int deqiqe = (int) ((toplam_saniye % 3600) / 60);
        int saniye = (int) ((toplam_saniye % 3600) % 60);

        String result = "";

        if (saat > 0) {
            result += saat + " saat ";
        }
        if (deqiqe > 0) {
            result += deqiqe + " dəqiqə ";
        }
        if (saniye > 0) {
            result += saniye + " saniyə";
        }

        // Hamısı sıfır olarsa
        if (result.isEmpty()) {
            result = "0 saniyə";
        }

        System.out.println(result.trim());

    }
}
