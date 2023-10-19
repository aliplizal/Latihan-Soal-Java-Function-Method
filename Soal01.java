import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama1 = input.next();
        String nama2 = input.next();
        
        ucapan(nama1);
        ucapan(nama2);
    }
    private static void ucapan(String nama) {
        System.out.println("Hai, " + nama + ". Semangat pagi!");
    }
}