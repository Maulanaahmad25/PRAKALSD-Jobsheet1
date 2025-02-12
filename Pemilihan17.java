
import java.util.Scanner;
public class Pemilihan17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input nilai
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int UTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int UAS = sc.nextInt();
        System.out.println("==============================");

        System.out.println("==============================");
        
        //Validasi bilai
        if ( tugas < 0 ||  tugas > 100 ||   kuis < 0 ||  kuis > 100 || 
        UTS < 0 ||  UTS > 100 ||  UAS < 0 ||  UAS > 100) {
            System.out.println("NILAI TIDAK VALID");    
            System.out.println("==============================");
            System.out.println("==============================");
        }
        //Hitung nilai akhir
        else {
            int nilaiAkhir = (tugas * 20/100) + (kuis * 20/100) + (UTS * 30/100) + (UAS * 30/100);
            System.out.println("Nilai Akhir Anda Adalah : " + nilaiAkhir);
            
        //Konversi nilai
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf: A");
            System.out.println("==============================");
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf: B+");
            System.out.println("==============================");
        }
        else if(nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf: B");
            System.out.println("==============================");
        }
        else if(nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf: C+");
            System.out.println("==============================");
        }
        else if(nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf: C");
            System.out.println("==============================");
        }
        else if(nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf: D");
            System.out.println("==============================");
        }else{
            System.out.println("Nilai Huruf: E");
            System.out.println("==============================");
        }
        // Cek lulus atau tidak lulus
        if (nilaiAkhir >= 51) {
            System.out.println("SELAMAT ANDA LULUS!");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
            System.out.println("==============================");
        }
    }
}


