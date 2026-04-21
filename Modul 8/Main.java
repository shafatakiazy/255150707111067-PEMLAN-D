public class Main {
    public static void main(String[] args) {

        // Data belanja karyawan 1
        Invoice[] belanjaBudi = {
            new Invoice("Beras 5kg", 2, 75000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Sabun Mandi", 5, 8000)
        };
        Employee budi = new Employee(1001, "Budi Santoso", 5000000, belanjaBudi);

        // Data belanja karyawan 2
        Invoice[] belanjaSari = {
            new Invoice("Gula 1kg", 4, 15000),
            new Invoice("Susu Kotak", 10, 12000)
        };
        Employee sari = new Employee(1002, "Sari Dewi", 4500000, belanjaSari);

        // Polimorfisme menggunakan array Payable
        Payable[] karyawanList = {budi, sari};
        for (Payable p : karyawanList) {
            if (p instanceof Employee) {
                ((Employee) p).tampilkanInfo();
            }
        }
    }
}