package homeWork;

import java.util.Scanner;

public class RaketinUchushMesafesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Başlanğıc atış sürəti (m/s): ");
        double v = input.nextDouble();

        System.out.println("Atış bucağı (dərəcə ilə): ");
        double alfa = input.nextDouble();
        double serbestDushmeTecili = 9.8;

        double R = (Math.pow(v, 2)*(Math.sin(2*Math.toRadians(alfa)))) / serbestDushmeTecili;

        int R2 = (int) Math.round(R);
        System.out.println(R2);
    }
}
