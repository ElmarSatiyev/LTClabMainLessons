package homeWork;

import java.util.Scanner;

public class BeynelxalqGonderishHecmiQiymeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double en = sc.nextDouble();
        double uzunluq = sc.nextDouble();
        double hundurluk = sc.nextDouble();

        double gonderis_hecmi = en * uzunluq * hundurluk;
        double hecm_cekisi = gonderis_hecmi / 6000;
        double yekun_qiymet  = hecm_cekisi * 1.5;

        System.out.println("Göndəriş həcmi: " + gonderis_hecmi);
        System.out.println("Həcm çəkisi: " + hecm_cekisi);
        System.out.println("Yekun qiymət: " + yekun_qiymet);


    }
}
