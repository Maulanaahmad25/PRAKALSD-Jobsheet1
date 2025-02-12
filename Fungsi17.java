public class Fungsi17 {
    // Data stok bunga di setiap cabang
    private static int[][] stockBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},   // RoyalGarden 2
        {2, 10, 10, 5},   // RoyalGarden 3
        {5, 7, 12, 9}     // RoyalGarden 4
    };
    //Harga dan pengurangan stock
    private static int[] hargaBunga = {75000, 50000, 60000, 10000};
    private static int[] penguranganStock = {-1, -2, 0, -5};

    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        tampilkanPendapatan();

        // Menampilkan jumlah stok setiap jenis bunga setelah pengurangan
        tampilkanStockSetelahPengurangan();
    }

    // Fungsi menampilkan pendapatan setiap cabang
    public static void tampilkanPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    // Fungsi untuk menampilkan jumlah stok setiap jenis bunga setelah pengurangan
    public static void tampilkanStockSetelahPengurangan() {
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("RoyalGarden " + (i + 1) + " setelah pengurangan stock:");
            for (int j = 0; j < stockBunga[i].length; j++) {
                int stockAkhir = stockBunga[i][j] + penguranganStock[j];
                System.out.println("  " + getNamaBunga(j) + ": " + stockAkhir);
            }
        }
    }

    // Fungsi untuk mendapatkan nama bunga
    public static String getNamaBunga(int indeks) {
        switch (indeks) {
            case 0: return "Agionema";
            case 1: return "Keladi";
            case 2: return "Alocasia";
            case 3: return "Mawar";
            default: return "Unknown";
        }
    }
}