package homeWork;

public class MassivinElementlerininCemlenmesi {
    public static void main(String[] args) {
        int [] numbers = new int[5];

        numbers[0] = 32;
        numbers[1] = 25;
        numbers[2] = 37;
        numbers[3] = 17;
        numbers[4] = 21;

        double sum = 0;
        double average = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;


        System.out.println("Cəm: " + sum);
        System.out.printf("Ədədi orta: %.2f ", average);
    }
}
