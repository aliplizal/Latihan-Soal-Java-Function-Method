import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int bilA = input.nextInt();
        int bilB = input.nextInt();
        int bilC =input.nextInt();
        int bilD =input.nextInt();

        System.out.println("hasil kali dari " + bilA + " dan " + bilB + " adalah " + perkalian(bilA, bilB));
        pertambahan(bilC, bilD);
        perkalian(bilA,bilB);
    }
    private static int perkalian (int a, int b) {
        int hitung = a * b;
        double nyoba = a / b;
        System.out.println(nyoba);
        return hitung;
    } 
    private static void pertambahan (int c, int d) {
        int hitung = c + d;
        System.out.println("hasil tambah dari " + c + " dan " + d + " adalah " +hitung);
    }
}
