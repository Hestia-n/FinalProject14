import java.util.Scanner;

public class Segitiga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Hitung Luas & Keliling Segitiga ===");
        System.out.print("Masukkan alas segitiga (cm): ");
        double alas = sc.nextDouble();

        System.out.print("Masukkan tinggi segitiga (cm): ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan sisi miring segitiga (cm): ");
        double sisiMiring = sc.nextDouble();

        double luas = 0.5 * alas * tinggi;
        double keliling = alas + tinggi + sisiMiring;

        System.out.println("\nHasil Perhitungan:");
        System.out.println("Luas segitiga     = " + luas + " cm²");
        System.out.println("Keliling segitiga = " + keliling + " cm");

        sc.close();
    }
}
