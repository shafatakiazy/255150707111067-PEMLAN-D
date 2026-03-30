public class BeliJaket {
    public static void main(String[] args) {

        // Tampilkan daftar harga (static, tanpa objek)
        Jaket.tampilHarga();

        // Membuat objek Jaket
        Jaket jaket = new Jaket();

        // Pembelian kurang dari atau sama dengan 100 (tanpa diskon)
        System.out.println("\n=== Pembelian Tanpa Diskon (<=100 buah) ===");
        int jumlahA1 = 50;
        int jumlahB1 = 75;
        int jumlahC1 = 100;
        System.out.println("Beli Jaket A " + jumlahA1 + " buah : Rp " + jaket.hitungJaketA(jumlahA1));
        System.out.println("Beli Jaket B " + jumlahB1 + " buah : Rp " + jaket.hitungJaketB(jumlahB1));
        System.out.println("Beli Jaket C " + jumlahC1 + " buah : Rp " + jaket.hitungJaketC(jumlahC1));

        // Pembelian lebih dari 100 (dapat diskon)
        System.out.println("\n=== Pembelian Dengan Diskon (>100 buah) ===");
        int jumlahA2 = 150;
        int jumlahB2 = 200;
        int jumlahC2 = 120;
        System.out.println("Beli Jaket A " + jumlahA2 + " buah : Rp " + jaket.hitungJaketA(jumlahA2));
        System.out.println("Beli Jaket B " + jumlahB2 + " buah : Rp " + jaket.hitungJaketB(jumlahB2));
        System.out.println("Beli Jaket C " + jumlahC2 + " buah : Rp " + jaket.hitungJaketC(jumlahC2));
    }
}

