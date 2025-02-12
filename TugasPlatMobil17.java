import java.util.Scanner;
import java.util.Arrays;
public class TugasPlatMobil17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = new char[10];
        char[][] KOTA = new char[10][12];
        
        // Data contoh untuk KODE dan KOTA
        String[] kode = {"B", "L", "D", "A", "F", "Z", "G", "H", "K", "T"};
        String[] kota = {
            "Jakarta", "Surabaya", "Bandung", "Serang",
            "Bogor", "Cirebon", "Semarang", "Malang",
            "Medan", "Tangerang"
        };
        
        // Mengisi array KODE dan KOTA
        for (int i = 0; i < 10; i++) {
            KODE[i] = kode[i].charAt(0); // Ambil karakter pertama
            Arrays.fill(KOTA[i], ' '); // Isi awal dengan spasi
            // Salin karakter dari string kota ke array
            for (int j = 0; j < kota[i].length() && j < 12; j++) {
                KOTA[i][j] = kota[i].charAt(j);
            }
        }
        
        // Membaca input pengguna
        System.out.print("Masukkan kode plat: ");
        String input = sc.nextLine().trim().toUpperCase();
        
        // Validasi input
        if (input.length() != 1) {
            System.out.println("Kode tidak valid");
            return;
        }
        
        char cariKode = input.charAt(0);
        int namaKode = -1;
        
        // Mencari kode dalam array
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == cariKode) {
            namaKode = i;
                break;
            }
        }
        
        // Menampilkan hasil
        if  (namaKode == -1) {
            System.out.println("Kode plat tidak ditemukan");
        } else {
            String namaKota = new String(KOTA [namaKode]).trim();
            System.out.println("Kota: " + namaKota);
        }
        
        sc.close();
    }
}