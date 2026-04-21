import java.util.Scanner;
public class MainMakhlukHidup {
    public static void main(String[] args) {

        Manusia m4 = new Manusia("Budi", 20);
        // m4.tampilkanNama(); // tidak dipanggil karena dihapus dari interface
        m4.tampilkanUmur();
        m4.makan();
        m4.berjalan();
        m4.bersuara();

        Hewan h = new Hewan();
        h.makan();
        h.berjalan();
        h.bersuara();
        // h.tampilkanNama(); // ERROR jika dipanggil
        // h.tampilkanUmur(); // ERROR jika dipanggil

        Manusia budi = new Manusia("Budi Santoso", 20);
        budi.tampilkanNama();
        budi.tampilkanUmur();
        budi.makan();
        budi.berjalan();
        budi.bersuara();

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(sc.nextLine());
        Manusia inputUser = new Manusia(nama, umur);
        System.out.println("\n=== DATA MANUSIA ===");
        inputUser.tampilkanNama();
        inputUser.tampilkanUmur();
        inputUser.makan();
        inputUser.berjalan();
        inputUser.bersuara();
        sc.close();

        Tumbuhan pohon = new Tumbuhan("Pohon Mangga");
        pohon.makan();
        pohon.berjalan();
        pohon.bersuara();
    }
}

