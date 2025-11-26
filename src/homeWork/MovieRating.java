package homeWork;

import java.util.Scanner;

public class MovieRating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sevdiyiniz son filmə 1-dən 10-a qədər reytinq verin");
        int rating = sc.nextInt();

        System.out.println(rating);
        if  (rating<=4 && rating>=1) {
            System.out.println("Çox pis qiymətləndirmə. Niyə belə bəyənmədiniz?");
        } else if (rating<=5 && rating>=7) {
            System.out.println("Orta qiymətləndirmə. Daha yaxşı filmlər tapaq!");
        } else if (rating<=10 && rating>=8) {
            System.out.println("Əla seçim! Bu filmi dostlarınıza tövsiyə etdiyinizə əmin olun.");
        } else {
            System.out.println("Reytinq 1 ilə 10 arasında olmalıdır. Xahiş edirəm yenidən yoxlayın.");
        }

        System.out.println("Sevdiyiniz bir janr seçin\n"+
                "1-Sci-Fi, 2-Drama, 3-Komediya, 4-Qorxu");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Tövsiyəm: Interstellar (2014).\n" +
                        "Bu filmi önərməyimin səbəbi odur ki, o həm kosmosun dərinliklərini,\n" +
                        "həm də insanın emosional dünyasını birləşdirir. Yəni yalnız elmi-fantastik\n" +
                        "macəra deyil, həm də ailə, sevgi və ümid mövzularını güclü şəkildə işləyir.");
                break;
            case 2:
                System.out.println("Tövsiyəm: The Pursuit of Happyness (2006).\n" +
                    "Bu filmi önərməyimin səbəbi odur ki, o, insanın çətinliklər \n" +
                    "qarşısında dözümlülüyünü və ümidini çox real və təsirli şəkildə göstərir.");
                break;
            case 3:
                System.out.println("Tövsiyəm: The Intouchables (2011, Fransa).\n" +
                        "Bu filmi önərməyimin səbəbi odur ki, o, həm güclü dostluq hekayəsi,\n" +
                        "həm də incə yumorla doludur. Komediya janrında olsa da, film həm də\n" +
                        "dram elementləri ilə insanı düşündürür və güldürür.");
                break;
            case 4:
                System.out.println("Tövsiyəm: The Conjuring (2013).\n" +
                        "Bu filmi önərməyimin səbəbi odur ki, o, klassik qorxu\n" +
                        "elementlərini (ruhlar, paranormal hadisələr) real hadisələrə\n" +
                        "əsaslanaraq təqdim edir və tamaşaçını həm gərginlikdə saxlayır,\n" +
                        "həm də hekayə ilə maraqlandırır.\n");
        }
    }
}
