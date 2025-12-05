package Main.Array;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int [4];

        System.out.println(arr.length);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String [] arr1 = {"Azər", "Əhməd", "Vasif"};

        for (String str : arr1) {
            System.out.println(str);
        }
    }
}
