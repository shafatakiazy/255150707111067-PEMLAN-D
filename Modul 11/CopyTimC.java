import java.util.*;

class Pemain1d {
    String tim;
    int tinggiBadan;
    int beratBadan;

    public Pemain1d(String tim, int tinggiBadan, int beratBadan) {
        this.tim = tim;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    @Override
    public String toString() {
        return "Tim " + tim + " | Tinggi: " + tinggiBadan + " cm | Berat: " + beratBadan + " kg";
    }
}

public class CopyTimC {

    public static void tampilkanList(List<Pemain1d> list, String judul) {
        System.out.println("\n=== " + judul + " ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void main(String[] args) {

        // Data Tim B: 
        int[][] dataTimB = {
            {170, 66}, {167, 60}, {165, 59}, {166, 58}, {168, 58},
            {175, 71}, {172, 68}, {171, 68}, {168, 65}, {169, 60}
        };

        ArrayList<Pemain1d> timB = new ArrayList<>();
        for (int[] d : dataTimB) timB.add(new Pemain1d("B", d[0], d[1]));

        System.out.println("======================================================");
        System.out.println("           COPY TIM B KE TIM C (BARU)");
        System.out.println("======================================================");
        tampilkanList(timB, "Isi Tim B (sebelum dicopy)");

        // Syarat Collections.copy(): ukuran timC harus >= ukuran timB
        // Gunakan Collections.nCopies() untuk membuat list berisi null sebanyak ukuran timB
        ArrayList<Pemain1d> timC = new ArrayList<>(Collections.nCopies(timB.size(), null));

        // Salin semua elemen Tim B ke Tim C
        Collections.copy(timC, timB);
        
        tampilkanList(timC, "Isi Tim C (hasil copy dari Tim B)");

        System.out.println("\nJumlah anggota Tim B : " + timB.size() + " orang");
        System.out.println("Jumlah anggota Tim C : " + timC.size() + " orang");
        System.out.println("\nCopy berhasil! Tim C terbentuk dengan " + timC.size() + " anggota.");
    }
}
