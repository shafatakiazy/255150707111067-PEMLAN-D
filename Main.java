// Main.java
public class Main {
    public static void main(String[] args) {

        // ===== TEST MANUSIA =====

        Manusia m1 = new Manusia("A", true, "111", true);
        System.out.println(m1);
        System.out.println();

        Manusia m2 = new Manusia("B", false, "222", true);
        System.out.println(m2);
        System.out.println();

        Manusia m3 = new Manusia("C", true, "333", false);
        System.out.println(m3);
        System.out.println();

        // ===== TEST MAHASISWA FILKOM =====

        // IPK < 3
        MahasiswaFILKOM mf1 = new MahasiswaFILKOM("D", false, "123", true, "215150300111081", 2.5);
        System.out.println(mf1);
        System.out.println();

        // IPK 3 - 3.5
        MahasiswaFILKOM mf2 = new MahasiswaFILKOM("E", false, "213", false, "205150701111027", 3.2);
        System.out.println(mf2);
        System.out.println();

        // IPK > 3.5
        MahasiswaFILKOM mf3 = new MahasiswaFILKOM("P", true, "333", true, "225150401111034", 4.0);
        System.out.println(mf3);
        System.out.println();

        // ===== TEST PEKERJA =====

        Pekerja p1 = new Pekerja(50.2, 2024, 3, 2, 2, "K",true, "324", true);
        System.out.println(p1);
        System.out.println();

        Pekerja p2 = new Pekerja(65.5, 2017, 1, 1, 1, "J", false, "456", true);
        System.out.println(p2);
        System.out.println();

        Pekerja p3 = new Pekerja(70.6, 2006, 6, 15, 5, "F", true, "678", true);
        System.out.println(p3);
        System.out.println();

        // ===== TEST MANAGER =====

        Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);
        System.out.println(d);
    }
}