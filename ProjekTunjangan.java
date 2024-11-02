/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ProjekTunjangan {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.nextLine();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n==========Hasil Perhitungan Gaji Anda==========");
        System.out.printf("Gaji Pokok      : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan       : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji      : Rp %.1f%n", totalGaji);
        System.out.println("(Developed by : XiaoChen)");
    }
}