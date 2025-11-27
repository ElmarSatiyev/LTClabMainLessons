package Loops;

public class PhoneBattery {
    public static void main(String[] args) {
        int batteryLevel = 100;

        while (batteryLevel <= 100) {
            System.out.println("Batareya faizi -> " + batteryLevel);
            batteryLevel-=10;

            if (batteryLevel == 0) {
                System.out.println("Batareya faizi " + batteryLevel + "oldu v cihaz söndü. ");
                break;
            }
        }
    }
}
