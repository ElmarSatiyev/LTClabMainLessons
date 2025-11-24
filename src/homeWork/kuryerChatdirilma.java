package homeWork;

import java.util.Scanner;

public class kuryerChatdirilma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Şəhər adını daxil edin: ");
        String sheher =  sc.nextLine().toLowerCase();;
        double sifarishMeblegi = sc.nextDouble();
        double catdirilmaQiymeti = 0;

        switch(sheher) {
            case "baki":
                catdirilmaQiymeti = 5;
                break;
            case "sumqayit":
                catdirilmaQiymeti = 7;
                break;
            case "xirdalan":
                catdirilmaQiymeti = 6;
                break;
            default:
                System.out.println("Çatdırılma xidməti yalnız Bakı, Sumqayıt və Xırdalan şəhərlərinə aiddir.");
        }


        if  (sifarishMeblegi>=50) {
            System.out.println("Sizin çatdırılma xidmətiniz ödənişsiz olacaq.");
        } else {
            System.out.println("Sizin çatdırılma xidmətinin qiyməti " + (int) catdirilmaQiymeti + " AZN olacaq.");
        }
    }
}



