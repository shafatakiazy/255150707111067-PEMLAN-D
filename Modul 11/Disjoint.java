// Soal Praktikum 2d
// Mengecek apakah Tim A dan Tim B memiliki nilai tinggi badan atau berat badan
// yang sama menggunakan Collections.disjoint()

import java.util.*;

public class Disjoint {

    public static void main(String[] args) {

        // ArrayList tinggi badan Tim A dan Tim B (dalam cm)
        ArrayList<Integer> tinggiBadanTimA = new ArrayList<>(
            Arrays.asList(168, 170, 165, 168, 172, 170, 169, 165, 171, 166)
        );
        ArrayList<Integer> tinggiBadanTimB = new ArrayList<>(
            Arrays.asList(170, 167, 165, 166, 168, 175, 172, 171, 168, 169)
        );

        // ArrayList berat badan Tim A dan Tim B (dalam kg)
        ArrayList<Integer> beratBadanTimA = new ArrayList<>(
            Arrays.asList(50, 60, 56, 55, 60, 70, 66, 56, 72, 56)
        );
        ArrayList<Integer> beratBadanTimB = new ArrayList<>(
            Arrays.asList(66, 60, 59, 58, 58, 71, 68, 68, 65, 60)
        );

        System.out.println("======================================================");
        System.out.println("      CEK KESAMAAN TIM A DAN TIM B (disjoint)");
        System.out.println("======================================================");

        // --- Cek kesamaan Tinggi Badan ---
        // disjoint() mengembalikan TRUE  jika TIDAK ADA nilai yang sama
        //                            FALSE jika ADA nilai yang sama
        System.out.println("\n--- Tinggi Badan ---");
        System.out.println("Tim A : " + tinggiBadanTimA);
        System.out.println("Tim B : " + tinggiBadanTimB);

        boolean disjointTinggi = Collections.disjoint(tinggiBadanTimA, tinggiBadanTimB);

        if (disjointTinggi) {
            System.out.println("Hasil : Tim A dan Tim B TIDAK memiliki tinggi badan yang sama.");
        } else {
            System.out.println("Hasil : Tim A dan Tim B MEMILIKI tinggi badan yang sama!");
            // Tampilkan nilai-nilai yang sama menggunakan HashSet dan retainAll()
            Set<Integer> setA = new HashSet<>(tinggiBadanTimA);
            Set<Integer> setB = new HashSet<>(tinggiBadanTimB);
            setA.retainAll(setB); // hanya menyisakan elemen yang ada di kedua set
            System.out.println("Nilai yang sama   : " + setA + " cm");
        }

        // --- Cek kesamaan Berat Badan ---
        System.out.println("\n--- Berat Badan ---");
        System.out.println("Tim A : " + beratBadanTimA);
        System.out.println("Tim B : " + beratBadanTimB);

        boolean disjointBerat = Collections.disjoint(beratBadanTimA, beratBadanTimB);

        if (disjointBerat) {
            System.out.println("Hasil : Tim A dan Tim B TIDAK memiliki berat badan yang sama.");
        } else {
            System.out.println("Hasil : Tim A dan Tim B MEMILIKI berat badan yang sama!");
            // Tampilkan nilai-nilai yang sama menggunakan HashSet dan retainAll()
            Set<Integer> setA2 = new HashSet<>(beratBadanTimA);
            Set<Integer> setB2 = new HashSet<>(beratBadanTimB);
            setA2.retainAll(setB2);
            System.out.println("Nilai yang sama   : " + setA2 + " kg");
        }
    }
}