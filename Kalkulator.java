public class Kalkulator {
    // Static Methodpenjumlahan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    // Static method - pengurangan
    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // Non static method - perkalian
    public double perkalian(double a, double b) {
        return a * b;
    }

    // Non static method - pembagian
    public double pembagian(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Tidak bisa membagi dengan 0.");
            return 0;
        }
        return a / b;
    }

    // Non static method - menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) {
            System.out.println("Error! Penyebut tidak boleh 0.");
            return;
        }
        int fpb = cariFPB(pembilang, penyebut);
        int hasilPembilang = pembilang / fpb;
        int hasilPenyebut  = penyebut / fpb;
        System.out.println("Pecahan sederhana: " + hasilPembilang + "/" + hasilPenyebut);
    }

    // Helper method untuk mencari FPB
    private int cariFPB(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
