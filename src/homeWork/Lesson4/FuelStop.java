package homeWork.Lesson4;

import java.util.Scanner;

public class FuelStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuel = 20;
        int fuelPlus = 0;
        while(true) {
            System.out.println("Cari yanacaq səviyyəsi: " + fuel);
            System.out.println("YDM-də neçə litr yanacaq dolduraq?");

            fuelPlus =  sc.nextInt();
            fuel =  fuelPlus + fuel;

            if (fuel>=80) {
                System.out.println("Yanacaq hədəfə çatdı. Səfərə davam!");
                break;
            } else  {
                System.out.println("Yanacaq yenə də azdır. Növbəti məntəqəyə gedirik...");
            }




        }
    }
}
