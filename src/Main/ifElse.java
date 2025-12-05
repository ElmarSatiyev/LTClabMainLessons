package Main;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir eded daxil et: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Bu eded musbetdir..");
        } else if (number < 0) {
            System.out.println("Bu eded menfidir..");
        } else {
            System.out.println("Bu eded 0-dir.");
        }
    }

}
