public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];
        daftarKue[0]  = new KuePesanan("Kue Lapis",        50000,  1.5);
        daftarKue[1]  = new KuePesanan("Kue Bolu",         60000,  2.0);
        daftarKue[2]  = new KuePesanan("Kue Nastar",       75000,  1.2);
        daftarKue[3]  = new KuePesanan("Kue Putri Salju",  80000,  1.0);
        daftarKue[4]  = new KuePesanan("Kue Brownies",     90000,  1.8);
        daftarKue[5]  = new KuePesanan("Kue Tart",        120000,  2.5);
        daftarKue[6]  = new KuePesanan("Kue Chiffon",      70000,  1.3);
        daftarKue[7]  = new KuePesanan("Kue Marmer",       65000,  1.7);
        daftarKue[8]  = new KuePesanan("Kue Pandan",       55000,  1.4);
        daftarKue[9]  = new KuePesanan("Kue Keju",        100000,  2.2);

        daftarKue[10] = new KueJadi("Roti Krim",           15000,  5);
        daftarKue[11] = new KueJadi("Donat Gula",          10000,  8);
        daftarKue[12] = new KueJadi("Muffin Coklat",       12000,  6);
        daftarKue[13] = new KueJadi("Croissant",           18000,  4);
        daftarKue[14] = new KueJadi("Eclair",              20000,  3);
        daftarKue[15] = new KueJadi("Sus Vla",             14000,  7);
        daftarKue[16] = new KueJadi("Kue Cubit",            8000, 10);
        daftarKue[17] = new KueJadi("Bolu Kukus",           9000,  9);
        daftarKue[18] = new KueJadi("Pie Buah",            25000,  4);
        daftarKue[19] = new KueJadi("Cheesecake Slice",    30000,  6);

        String garis      = "=".repeat(75);
        String garisTipis = "-".repeat(75);

        System.out.println("           DAFTAR TOTAL SEMUA KUE");
        System.out.println(garisTipis);
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.printf("%2d. %s%n", (i + 1), daftarKue[i].toString());
        }

        double totalSemuaHarga = 0;
        for (Kue k : daftarKue) {
            totalSemuaHarga += k.hitungHarga();
        }
        System.out.println(garis);
        System.out.printf("TOTAL HARGA SEMUA KUE : Rp%,.0f%n", totalSemuaHarga);

        double totalHargaPesanan = 0, totalBerat = 0;
        System.out.println(garisTipis);
        System.out.println("REKAP KUE PESANAN");
        for (Kue k : daftarKue) {
            if (k instanceof KuePesanan kp) {
                totalHargaPesanan += kp.hitungHarga();
                totalBerat        += kp.getBerat();
            }
        }
        System.out.printf("Total Berat  : %.1f kg%n", totalBerat);
        System.out.printf("Total Harga  : Rp%,.0f%n", totalHargaPesanan);

        double totalHargaJadi = 0, totalJumlah = 0;
        System.out.println(garisTipis);
        System.out.println("REKAP KUE JADI");
        for (Kue k : daftarKue) {
            if (k instanceof KueJadi kj) {
                totalHargaJadi += kj.hitungHarga();
                totalJumlah    += kj.getJumlah();
            }
        }
        System.out.printf("Total Jumlah : %.0f pcs%n", totalJumlah);
        System.out.printf("Total Harga  : Rp%,.0f%n", totalHargaJadi);

        Kue kueMaxHarga = daftarKue[0];
        for (Kue k : daftarKue) {
            if (k.hitungHarga() > kueMaxHarga.hitungHarga()) {
                kueMaxHarga = k;
            }
        }
        System.out.println(garis);
        System.out.println("KUE DENGAN HARGA PALING MAHAL");
        System.out.println(kueMaxHarga.toString());
        System.out.println(garis);
    }
}