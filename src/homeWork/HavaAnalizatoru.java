package homeWork;
import java.util.Arrays;


public class HavaAnalizatoru {
    public static void main(String[] args) {
        double [] temperatures = {29.2, 27.3, 24.3, 20.9, 21.7, 28.6, 22.5};
        double sum = 0;
        double maxTemp = temperatures[0];
        double minTemp = temperatures[0];

        for (double temp : temperatures) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
            sum += temp;
        }

        // Həftəlik orta temperatur:
        double weeklyAvgTemp = sum / temperatures.length;

        System.out.println("Temperaturlar: " + Arrays.toString(temperatures));
        System.out.println("Həftəlik orta temperatur: " + String.format("%.2f", weeklyAvgTemp));
        System.out.println("Ən yüksək temperatur: " + String.format("%.2f", maxTemp));
        System.out.println("Ən aşağı temperatur: " + String.format("%.2f", minTemp));




    }
}

