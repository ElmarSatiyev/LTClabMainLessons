package homeWork;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passwordUser = "1234";
        int attempts = 3;

        while (true) {
            System.out.println("Sifreni daxil et: ");
            String password = input.nextLine();
            if (password.equals(passwordUser)) {
                System.out.println("Sistemə daxil oldunuz!");
                break;
            } else  {
                System.out.println("Yanlış PİN. Yenidən cəhd edin");
                attempts--;
                if (attempts==0) {
                    System.out.println("Kartınız bloklandı");
                    break;
                }
            }
        }

    }
}
