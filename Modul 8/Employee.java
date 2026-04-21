public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, 
                    int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getTotalBelanja() {
        int total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalBelanja();
    }

    public void tampilkanInfo() {
        System.out.println("============================================");
        System.out.println("  DATA KARYAWAN");
        System.out.println("============================================");
        System.out.println("  No. Registrasi : " + registrationNumber);
        System.out.println("  Nama           : " + name);
        System.out.println("  Gaji per Bulan : Rp" + salaryPerMonth);
        System.out.println("\n  DETAIL BELANJA DI KOPERASI:");
        System.out.println("  ----------------------------");
        for (Invoice inv : invoices) {
            inv.tampilkanDetail();
        }
        System.out.println("  Total Belanja  : Rp" + getTotalBelanja());
        System.out.println("  Gaji Bersih    : Rp" + getPayableAmount());
        System.out.println("============================================");
    }
}

