package homeWork.Lesson6;

import java.util.Arrays;

public class SetrlerinCemi {
    public static void main(String[] args) {
        int [][] numbers = new int[3][3];
        double [] sumRows = new double[3];
        double sumArray = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i+j;
                System.out.printf("index [%d][%d] = %d\n", i, j, numbers[i][j]);
                sumRows[i] += numbers[i][j];
                sumArray += numbers[i][j];
            }
        }

        System.out.println("Sətrlərin cəmi: " + Arrays.toString(sumRows));
        System.out.println("Massivin bütün dəyərlərinin cəmi: " + sumArray);

        for (int [] row : numbers) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


    }
}
