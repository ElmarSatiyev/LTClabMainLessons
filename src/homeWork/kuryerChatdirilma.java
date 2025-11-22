package homeWork;

import java.util.Scanner;

public class kuryerChatdirilma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Şəhər adını daxil edin: ");
        String sheher =  sc.nextLine();


        switch(sheher) {
            case "Bakı":
                System.out.println("Ödənişsiz çatdırılacaq.");
                break;
            case "Sumqayıt":
                System.out.println("Sizin çatdırılma xidmətinin qiyməti 7 AZN olacaq");
                break;
            case "Xırdalan":
                System.out.println("Sizin çatdırılma xidmətinin qiyməti 5 AZN olacaq");
                break;
            default:
                System.out.println("Çatdırılma xidməti yalnız Bakı, Sumqayıt və Xırdalan şəhərlərinə aiddir.");
        }
    }
}
