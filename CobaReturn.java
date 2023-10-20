import java.util.Scanner;

public class CobaReturn {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int angka = input.nextInt();

    System.out.println(hitungKuadrat(angka));
    }
    public static int hitungKuadrat (int x) {
        int hitungHasil = x * x;
        // System.out.println(hitungHasil);
        return hitungHasil;
    }
}
