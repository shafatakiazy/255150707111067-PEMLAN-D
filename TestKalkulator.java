public class TestKalkulator {
    public static void main(String[] args) {

        // Static method - langsung dipanggil tanpa objek
        System.out.println("=== Static Method ===");
        System.out.println("Penjumlahan 10 + 5  : " + Kalkulator.penjumlahan(10, 5));
        System.out.println("Pengurangan 10 - 5  : " + Kalkulator.pengurangan(10, 5));

        // Non static method - perlu membuat objek dulu
        System.out.println("\n=== Non Static Method ===");
        Kalkulator calc = new Kalkulator();
        System.out.println("Perkalian 10 x 5    : " + calc.perkalian(10, 5));
        System.out.println("Pembagian 10 / 5    : " + calc.pembagian(10, 5));
        System.out.println("Pembagian 10 / 0    : " + calc.pembagian(10, 0));

        // Non static method - menyederhanakan pecahan
        System.out.println("\n=== Menyederhanakan Pecahan ===");
        calc.sederhana(12, 18);
        calc.sederhana(25, 100);
        calc.sederhana(7, 14);
        calc.sederhana(5, 0);
    }
}
