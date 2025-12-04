package homeWork;

import java.util.Scanner;

public class elementleriFilterEt {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int countP=0;
        int countN=0;


        int [] balanslar = {-10, 20, 5, 30, 15, -40, 5, 10};

        for (int i=0; i<balanslar.length; i++) {
            if (balanslar[i]>=0) {
                System.out.println(balanslar[i]);
                countP +=1;
            } else {
                countN +=1;
            }


        }
        if (countP>0 && countN>0) {
            System.out.println("Massivdəki müsbət elementlərin sayı - " + countP + ", mənfi elementlərin sayı - " + countN);
        } else if (countP>0 && countN==0) {
            System.out.println("Massivdəki müsbət elementlərin sayı - " + countP + ", mənfi element isə yoxdur.");
        } else if (countP==0 && countN>0) {
            System.out.println("Massivdəki mənfi elementlərin sayı - " + countN + ", müsbət element isə yoxdur");
        }
    }
}
