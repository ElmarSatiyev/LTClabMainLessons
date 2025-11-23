package homeWork;

import java.util.Scanner;

public class BeynelxalqGonderishHecmiQiymeti {
    public static void main(String[] args) {

        System.out.println("--- Beynəlxalq Göndərişin Qiymətləndirilməsi ---");
        Scanner sc = new Scanner(System.in);

        System.out.println("Uzunluğu daxil edin (sm):");
        double uzunluq = sc.nextDouble();
        System.out.println("Eni daxil edin (sm):");
        double en = sc.nextDouble();
        System.out.println("Hündürlüyü daxil edin (sm):");
        double hundurluk = sc.nextDouble();

        double gonderis_hecmi = en * uzunluq * hundurluk;
        double hecm_cekisi = gonderis_hecmi / 6000;
        double yekun_qiymet  = hecm_cekisi * 1.5;

        System.out.println("Göndəriş həcmi: " + gonderis_hecmi);
        System.out.println("Həcm çəkisi: " + hecm_cekisi);
        System.out.println("Yekun qiymət: " + yekun_qiymet);


    }
}
