import java.util.Scanner;

public class Segitiga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas Segitiga ===");
        System.out.print("Masukkan alas segitiga (cm): ");
        double alas = sc.nextDouble();

        System.out.print("Masukkan tinggi segitiga (cm): ");
        double tinggi = sc.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga = " + luas + " cm²");

        sc.close();
    }
}
