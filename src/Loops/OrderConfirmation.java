package Loops;

import java.util.Scanner;

public class OrderConfirmation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isConfirmed = false;
        String answer = "";
        do {
            System.out.println("Sifarişinizi son dəfə nəzərdən keçirin. Ümumi məbləğ: 85 AZN");
            System.out.println("Sifarişi təsdiqləyirsiniz? (yes/no)");
            answer = input.nextLine();
            if (!input.nextLine().equalsIgnoreCase("yes")) {
                isConfirmed = true;
            }


        } while (isConfirmed!=true);
        System.out.println("✅ Sifariş Təsdiqləndi! Göndərilmə prosesinə başlandı.");
    }
}
