public class Jaket {
    // Harga tetap (final) untuk masing-masing tipe jaket
    private static final double HARGA_A = 100000;
    private static final double HARGA_B = 125000;
    private static final double HARGA_C = 175000;

    // Harga setelah diskon
    private static final double DISKON_A = 95000;
    private static final double DISKON_B = 120000;
    private static final double DISKON_C = 160000;

    // Non static method - menghitung total harga jaket A
    public double hitungJaketA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_A;
        } else {
            return jumlah * HARGA_A;
        }
    }

    // Non static method - menghitung total harga jaket B
    public double hitungJaketB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_B;
        } else {
            return jumlah * HARGA_B;
        }
    }

    // Non static method - menghitung total harga jaket C
    public double hitungJaketC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * DISKON_C;
        } else {
            return jumlah * HARGA_C;
        }
    }

    // Static method - menampilkan harga satuan jaket
    public static void tampilHarga() {
        System.out.println("=== Daftar Harga Jaket CV. Labkomdas ===");
        System.out.println("Jaket A : Rp " + HARGA_A);
        System.out.println("Jaket B : Rp " + HARGA_B);
        System.out.println("Jaket C : Rp " + HARGA_C);
        System.out.println("========================================");
        System.out.println("=== Harga Diskon (>100 buah) ===");
        System.out.println("Jaket A : Rp " + DISKON_A);
        System.out.println("Jaket B : Rp " + DISKON_B);
        System.out.println("Jaket C : Rp " + DISKON_C);
        System.out.println("================================");
    }
}

