package homeWork.Lesson4;

import java.util.Scanner;

public class BookShelver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kitabların sayını daxil edin");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Kitab " + i + " nömrəli rəfə qoyuldu və nömrələndi.");
        }
        System.out.println("Bütün " + count + " kitab rəfə yerləşdirildi.");
    }
}
