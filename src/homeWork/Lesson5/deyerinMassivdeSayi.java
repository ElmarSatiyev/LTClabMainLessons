package homeWork.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class deyerinMassivdeSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] balanslar = {5, 7, 9, 1, 1, 2, 5, 9, 5, 2, 1, 7, 2, 3};
        Arrays.sort(balanslar);
        int count = 0;

        System.out.println("Hansı dəyəri axtarırsınız?");
        int axtar = Integer.parseInt(input.nextLine());

        for (int balans : balanslar) {
            if (balans == axtar) {
                count++;
            }
        }


        if (count == 0) {
            System.out.println("Axtardığınız " + axtar + " ədədi massivdə yoxdur");
        } else if (count == 1) {
            System.out.println("Axtardığınız " + axtar + " ədədi massivdə cəmi " + count + " dəfə iştirak edir.");
        } else {
            System.out.println("Axtardığınız " + axtar + " ədədi massivdə var və " + count + " dəfə təkrarlanır.");
        }

    }
}
