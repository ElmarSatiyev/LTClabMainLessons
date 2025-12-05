package homeWork.Lesson6;

public class MaxDeyerinTapilmasi {

    public static void main(String[] args) {
        int [][] numbers = {
                {3, 2, 1},
                {8, 5, 4},
                {1, 3, 6}
        };

        int maxValue = numbers[0][0];
        int minValue = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > maxValue) {
                    maxValue = numbers[i][j];
                }
                if (numbers[i][j] < minValue) {
                    minValue = numbers[i][j];
                }
            }
        }
        System.out.println("Maksimum dəyər: " + maxValue);
        System.out.println("Minumum dəyər " + minValue);


    }

}
