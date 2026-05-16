import java.util.*;

class Pemain1c {
    String tim;
    int tinggiBadan;
    int beratBadan;

    public Pemain1c(String tim, int tinggiBadan, int beratBadan) {
        this.tim = tim;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    @Override
    public String toString() {
        return "Tim " + tim + " | Tinggi: " + tinggiBadan + " cm | Berat: " + beratBadan + " kg";
    }
}

public class MaxMin {

    public static void main(String[] args) {

        // Data Tim A: 
        int[][] dataTimA = {
            {168, 50}, {170, 60}, {165, 56}, {168, 55}, {172, 60},
            {170, 70}, {169, 66}, {165, 56}, {171, 72}, {166, 56}
        };

        // Data Tim B: 
        int[][] dataTimB = {
            {170, 66}, {167, 60}, {165, 59}, {166, 58}, {168, 58},
            {175, 71}, {172, 68}, {171, 68}, {168, 65}, {169, 60}
        };

        // Buat ArrayList terpisah untuk Tim A dan Tim B
        ArrayList<Pemain1c> timA = new ArrayList<>();
        ArrayList<Pemain1c> timB = new ArrayList<>();
        for (int[] d : dataTimA) timA.add(new Pemain1c("A", d[0], d[1]));
        for (int[] d : dataTimB) timB.add(new Pemain1c("B", d[0], d[1]));

        System.out.println("======================================================");
        System.out.println("       MAX & MIN TINGGI DAN BERAT BADAN");
        System.out.println("======================================================");

        // Comparator berdasarkan tinggi badan
        Comparator<Pemain1c> compTinggi = new Comparator<Pemain1c>() {
            public int compare(Pemain1c a, Pemain1c b) {
                return a.tinggiBadan - b.tinggiBadan;
            }
        };

        // Comparator berdasarkan berat badan
        Comparator<Pemain1c> compBerat = new Comparator<Pemain1c>() {
            public int compare(Pemain1c a, Pemain1c b) {
                return a.beratBadan - b.beratBadan;
            }
        };

        // --- Hasil Max dan Min Tim A ---
        Pemain1c maxTinggiA = Collections.max(timA, compTinggi);
        Pemain1c minTinggiA = Collections.min(timA, compTinggi);
        Pemain1c maxBeratA  = Collections.max(timA, compBerat);
        Pemain1c minBeratA  = Collections.min(timA, compBerat);

        System.out.println("\n--- Tim A ---");
        System.out.println("Max Tinggi Badan : " + maxTinggiA.tinggiBadan + " cm  ->  " + maxTinggiA);
        System.out.println("Min Tinggi Badan : " + minTinggiA.tinggiBadan + " cm  ->  " + minTinggiA);
        System.out.println("Max Berat Badan  : " + maxBeratA.beratBadan   + " kg  ->  " + maxBeratA);
        System.out.println("Min Berat Badan  : " + minBeratA.beratBadan   + " kg  ->  " + minBeratA);

        // --- Hasil Max dan Min Tim B ---
        Pemain1c maxTinggiB = Collections.max(timB, compTinggi);
        Pemain1c minTinggiB = Collections.min(timB, compTinggi);
        Pemain1c maxBeratB  = Collections.max(timB, compBerat);
        Pemain1c minBeratB  = Collections.min(timB, compBerat);

        System.out.println("\n--- Tim B ---");
        System.out.println("Max Tinggi Badan : " + maxTinggiB.tinggiBadan + " cm  ->  " + maxTinggiB);
        System.out.println("Min Tinggi Badan : " + minTinggiB.tinggiBadan + " cm  ->  " + minTinggiB);
        System.out.println("Max Berat Badan  : " + maxBeratB.beratBadan   + " kg  ->  " + maxBeratB);
        System.out.println("Min Berat Badan  : " + minBeratB.beratBadan   + " kg  ->  " + minBeratB);
    }
}