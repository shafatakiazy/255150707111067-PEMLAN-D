import java.util.*;

public class FreqBeratTimA {

    public static void main(String[] args) {

        // ArrayList berat badan Tim A (dalam kg)
        ArrayList<Integer> beratBadanTimA = new ArrayList<>(
            Arrays.asList(50, 60, 56, 55, 60, 70, 66, 56, 72, 56)
        );

        System.out.println("======================================================");
        System.out.println("         FREQUENCY BERAT BADAN TIM A");
        System.out.println("======================================================");

        System.out.println("\nData Berat Badan Tim A (asli) : " + beratBadanTimA);

        // --- Mencari frekuensi menggunakan Collections.frequency() ---

        // Cari berapa pemain dengan berat 56 kg
        int target1 = 56;
        int frekuensi1 = Collections.frequency(beratBadanTimA, target1);
        System.out.println("\nJumlah pemain Tim A dengan berat badan " + target1 + " kg : "
                           + frekuensi1 + " orang");

        // Cari berapa pemain dengan berat 53 kg
        int target2 = 53;
        int frekuensi2 = Collections.frequency(beratBadanTimA, target2);
        System.out.println("Jumlah pemain Tim A dengan berat badan " + target2 + " kg : "
                           + frekuensi2 + " orang");

        // --- Mencari posisi menggunakan Collections.binarySearch() ---
        // WAJIB diurutkan dulu sebelum binarySearch dijalankan!
        ArrayList<Integer> sortedBeratA = new ArrayList<>(beratBadanTimA);
        Collections.sort(sortedBeratA);

        System.out.println("\nData Berat Badan Tim A (setelah diurutkan) : " + sortedBeratA);

        // Binary search untuk 56 kg
        int hasilBS1 = Collections.binarySearch(sortedBeratA, target1);
        if (hasilBS1 >= 0)
            System.out.println("Binary Search " + target1 + " kg : ditemukan di index ke-" + hasilBS1);
        else
            System.out.println("Binary Search " + target1 + " kg : tidak ditemukan (index: " + hasilBS1 + ")");

        // Binary search untuk 53 kg
        int hasilBS2 = Collections.binarySearch(sortedBeratA, target2);
        if (hasilBS2 >= 0)
            System.out.println("Binary Search " + target2 + " kg : ditemukan di index ke-" + hasilBS2);
        else
            System.out.println("Binary Search " + target2 + " kg : tidak ditemukan (index: " + hasilBS2 + ")");
    }
}