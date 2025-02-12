import java.util.Scanner;
public class Perulangan17 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);       
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        // Ambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n kurang dari 10, tambah 10
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        // Cetak deret bilangan
        for (int i = 1; i <= n; i++) {
            // Jika bilangan ganjil, cetak (*)
            if (i % 2 != 0) {
                System.out.print("* ");
            } 
            // Jika bilangan genap, cetak bilangan
            else if (i == 6 || i == 10) {
                continue; // Lewati bilangan 6 dan 10
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
