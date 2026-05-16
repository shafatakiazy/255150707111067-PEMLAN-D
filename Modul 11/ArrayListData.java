import java.util.*;

public class ArrayListData {

    public static void main(String[] args) {

        System.out.println("======================================================");
        System.out.println("        DATA TIM A DAN TIM B (ArrayList)");
        System.out.println("======================================================");

        // ArrayList tinggi badan Tim A 
        ArrayList<Integer> tinggiBadanTimA = new ArrayList<>(
            Arrays.asList(168, 170, 165, 168, 172, 170, 169, 165, 171, 166)
        );

        // ArrayList berat badan Tim A 
        ArrayList<Integer> beratBadanTimA = new ArrayList<>(
            Arrays.asList(50, 60, 56, 55, 60, 70, 66, 56, 72, 56)
        );

        // ArrayList tinggi badan Tim B 
        ArrayList<Integer> tinggiBadanTimB = new ArrayList<>(
            Arrays.asList(170, 167, 165, 166, 168, 175, 172, 171, 168, 169)
        );

        // ArrayList berat badan Tim B 
        ArrayList<Integer> beratBadanTimB = new ArrayList<>(
            Arrays.asList(66, 60, 59, 58, 58, 71, 68, 68, 65, 60)
        );

        // Tampilkan data Tim A
        System.out.println("\n--- Data Tim A ---");
        System.out.println("Tinggi Badan (cm) : " + tinggiBadanTimA);
        System.out.println("Berat Badan  (kg) : " + beratBadanTimA);
        System.out.println("Jumlah pemain     : " + tinggiBadanTimA.size() + " orang");

        // Tampilkan data Tim B
        System.out.println("\n--- Data Tim B ---");
        System.out.println("Tinggi Badan (cm) : " + tinggiBadanTimB);
        System.out.println("Berat Badan  (kg) : " + beratBadanTimB);
        System.out.println("Jumlah pemain     : " + tinggiBadanTimB.size() + " orang");

        System.out.println("\nTotal 4 ArrayList berhasil dibuat untuk Tim A dan Tim B.");
    }
}