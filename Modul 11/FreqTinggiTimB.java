import java.util.*;

public class FreqTinggiTimB {

    public static void main(String[] args) {

        // ArrayList tinggi badan Tim B 
        ArrayList<Integer> tinggiBadanTimB = new ArrayList<>(
            Arrays.asList(170, 167, 165, 166, 168, 175, 172, 171, 168, 169)
        );

        System.out.println("======================================================");
        System.out.println("  SOAL 2b: FREQUENCY TINGGI BADAN TIM B");
        System.out.println("======================================================");

        System.out.println("\nData Tinggi Badan Tim B (asli) : " + tinggiBadanTimB);

        // --- Mencari frekuensi menggunakan Collections.frequency() ---

        // Cari berapa pemain dengan tinggi 168 cm
        int target1 = 168;
        int frekuensi1 = Collections.frequency(tinggiBadanTimB, target1);
        System.out.println("\nJumlah pemain Tim B dengan tinggi badan " + target1 + " cm : "
                           + frekuensi1 + " orang");

        // Cari berapa pemain dengan tinggi 160 cm
        int target2 = 160;
        int frekuensi2 = Collections.frequency(tinggiBadanTimB, target2);
        System.out.println("Jumlah pemain Tim B dengan tinggi badan " + target2 + " cm : "
                           + frekuensi2 + " orang");

        // --- Mencari posisi menggunakan Collections.binarySearch() ---
        // WAJIB diurutkan dulu sebelum binarySearch dijalankan!
        ArrayList<Integer> sortedTinggiB = new ArrayList<>(tinggiBadanTimB);
        Collections.sort(sortedTinggiB);

        System.out.println("\nData Tinggi Badan Tim B (setelah diurutkan) : " + sortedTinggiB);

        // Binary search untuk 168 cm
        int hasilBS1 = Collections.binarySearch(sortedTinggiB, target1);
        if (hasilBS1 >= 0)
            System.out.println("Binary Search " + target1 + " cm : ditemukan di index ke-" + hasilBS1);
        else
            System.out.println("Binary Search " + target1 + " cm : tidak ditemukan (index: " + hasilBS1 + ")");

        // Binary search untuk 160 cm
        int hasilBS2 = Collections.binarySearch(sortedTinggiB, target2);
        if (hasilBS2 >= 0)
            System.out.println("Binary Search " + target2 + " cm : ditemukan di index ke-" + hasilBS2);
        else
            System.out.println("Binary Search " + target2 + " cm : tidak ditemukan (index: " + hasilBS2 + ")");
    }
}