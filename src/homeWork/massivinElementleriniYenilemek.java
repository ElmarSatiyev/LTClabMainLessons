package homeWork;

import java.util.Arrays;

public class massivinElementleriniYenilemek {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] newnumbers = new int[numbers.length];

        for (int i=0; i<numbers.length; i++) {
            newnumbers[i] = numbers[i] + 5;
        }

        System.out.println(Arrays.toString(numbers) + " " + Arrays.toString(newnumbers));
    }
}
