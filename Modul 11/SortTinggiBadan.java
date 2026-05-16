// Soal Praktikum 1a
// Mengurutkan semua pemain Tim A dan Tim B berdasarkan tinggi badan
// secara ascending (menaik) dan descending (menurun)

import java.util.*;

class Pemain1a {
    String tim;
    int tinggiBadan;
    int beratBadan;

    public Pemain1a(String tim, int tinggiBadan, int beratBadan) {
        this.tim = tim;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    @Override
    public String toString() {
        return "Tim " + tim + " | Tinggi: " + tinggiBadan + " cm | Berat: " + beratBadan + " kg";
    }
}

public class SortTinggiBadan {

    public static void tampilkanList(List<Pemain1a> list, String judul) {
        System.out.println("\n=== " + judul + " ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void main(String[] args) {

        // Data Tim A: {tinggiBadan, beratBadan}
        int[][] dataTimA = {
            {168, 50}, {170, 60}, {165, 56}, {168, 55}, {172, 60},
            {170, 70}, {169, 66}, {165, 56}, {171, 72}, {166, 56}
        };

        // Data Tim B: {tinggiBadan, beratBadan}
        int[][] dataTimB = {
            {170, 66}, {167, 60}, {165, 59}, {166, 58}, {168, 58},
            {175, 71}, {172, 68}, {171, 68}, {168, 65}, {169, 60}
        };

        // Masukkan semua pemain Tim A dan Tim B ke dalam satu ArrayList
        ArrayList<Pemain1a> semuaPemain = new ArrayList<>();
        for (int[] d : dataTimA) semuaPemain.add(new Pemain1a("A", d[0], d[1]));
        for (int[] d : dataTimB) semuaPemain.add(new Pemain1a("B", d[0], d[1]));

        System.out.println("======================================================");
        System.out.println("    URUTAN BERDASARKAN TINGGI BADAN");
        System.out.println("======================================================");

        // Ascending: urutkan dari tinggi badan terkecil ke terbesar
        // Rumus: a - b → jika positif, a lebih besar → b didahulukan
        Collections.sort(semuaPemain, new Comparator<Pemain1a>() {
            public int compare(Pemain1a a, Pemain1a b) {
                return a.tinggiBadan - b.tinggiBadan;
            }
        });
        tampilkanList(semuaPemain, "Tinggi Badan ASCENDING (Terpendek ke Tertinggi)");

        // Descending: urutkan dari tinggi badan terbesar ke terkecil
        // Rumus: b - a → dibalik dari ascending
        Collections.sort(semuaPemain, new Comparator<Pemain1a>() {
            public int compare(Pemain1a a, Pemain1a b) {
                return b.tinggiBadan - a.tinggiBadan;
            }
        });
        tampilkanList(semuaPemain, "Tinggi Badan DESCENDING (Tertinggi ke Terpendek)");
    }
}

