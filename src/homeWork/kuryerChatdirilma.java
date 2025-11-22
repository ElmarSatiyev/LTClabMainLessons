package homeWork;

import java.util.Scanner;

public class kuryerChatdirilma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Şəhər adını daxil edin: ");
        String sheher =  sc.nextLine();
        double sifarishMeblegi = sc.nextDouble();


        switch(sheher) {
            case "Bakı":
                if (sifarishMeblegi>50) {
                    System.out.println("Sizin çatdırılma xidmətiniz ödənişsiz olacaq.");
                } else {
                    System.out.println("Sizin çatdırılma xidmətinin qiyməti 5 AZN olacaq");
                }
                break;
            case "Sumqayıt":
                if (sifarishMeblegi>50) {
                    System.out.println("Sizin çatdırılma xidmətiniz ödənişsiz olacaq.");
                } else {
                    System.out.println("Sizin çatdırılma xidmətinin qiyməti 7 AZN olacaq");
                }
                break;
            case "Xırdalan":
                if (sifarishMeblegi>50) {
                    System.out.println("Sizin çatdırılma xidmətiniz ödənişsiz olacaq.");
                } else {
                    System.out.println("Sizin çatdırılma xidmətinin qiyməti 6 AZN olacaq");
                }
                break;
            default:
                System.out.println("Çatdırılma xidməti yalnız Bakı, Sumqayıt və Xırdalan şəhərlərinə aiddir.");
        }
    }
}
