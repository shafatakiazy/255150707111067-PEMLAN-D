// Soal Praktikum 1b
// Mengurutkan semua pemain Tim A dan Tim B berdasarkan berat badan
// secara ascending (menaik) dan descending (menurun)

import java.util.*;

class Pemain1b {
    String tim;
    int tinggiBadan;
    int beratBadan;

    public Pemain1b(String tim, int tinggiBadan, int beratBadan) {
        this.tim = tim;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    @Override
    public String toString() {
        return "Tim " + tim + " | Tinggi: " + tinggiBadan + " cm | Berat: " + beratBadan + " kg";
    }
}

public class SortBeratBadan {

    public static void tampilkanList(List<Pemain1b> list, String judul) {
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
        ArrayList<Pemain1b> semuaPemain = new ArrayList<>();
        for (int[] d : dataTimA) semuaPemain.add(new Pemain1b("A", d[0], d[1]));
        for (int[] d : dataTimB) semuaPemain.add(new Pemain1b("B", d[0], d[1]));

        System.out.println("======================================================");
        System.out.println("    URUTAN BERDASARKAN BERAT BADAN");
        System.out.println("======================================================");

        // Ascending: urutkan dari berat badan terkecil ke terbesar
        // Rumus: a - b → jika positif, a lebih berat → b didahulukan
        Collections.sort(semuaPemain, new Comparator<Pemain1b>() {
            public int compare(Pemain1b a, Pemain1b b) {
                return a.beratBadan - b.beratBadan;
            }
        });
        tampilkanList(semuaPemain, "Berat Badan ASCENDING (Teringan ke Terberat)");

        // Descending: urutkan dari berat badan terbesar ke terkecil
        // Rumus: b - a → dibalik dari ascending
        Collections.sort(semuaPemain, new Comparator<Pemain1b>() {
            public int compare(Pemain1b a, Pemain1b b) {
                return b.beratBadan - a.beratBadan;
            }
        });
        tampilkanList(semuaPemain, "Berat Badan DESCENDING (Terberat ke Teringan)");
    }
}