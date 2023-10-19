import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai suhu!!!");

        System.out.print("Suhu minimal (Celsius) = ");
        int minimal = input.nextInt();

        System.out.print("Suhu rata-rata (Celsius) = ");
        int rataRata = input.nextInt();

        System.out.print("Suhu maksimal (Celsius) = ");
        int maksimal = input.nextInt();

        hitungFahrenheit(minimal);
        hitungFahrenheit(rataRata);
        hitungFahrenheit(maksimal);
    }

    private static void hitungFahrenheit(double suhuCelsius) {
        double hitungFahrenheit = (9.0 / 5 * suhuCelsius) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + hitungFahrenheit);
    }
}
