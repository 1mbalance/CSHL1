package Loops;

public class Ex65Temperaturee {
    public static void main(String[] args) {
        int celciusTemperature;
        double fahrenheitTemperature;
        System.out.println("-------------------------------------------------------");
        System.out.println("| Temperature in Celcius  | Temperature in Fahrenheit |");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i <= 100; i += 10) {
            celciusTemperature = i;
            fahrenheitTemperature = (celciusTemperature * 9/5) + 32;
            System.out.println("| " + celciusTemperature + " | " + fahrenheitTemperature  + " |");
        }

        System.out.println("-------------------------------------------------------");
    }
}
