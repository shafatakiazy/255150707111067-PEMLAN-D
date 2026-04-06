import java.time.LocalDate;
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak,
                   String nama, boolean jenisKelamin,String nik, boolean menikah) {
        super(nama,jenisKelamin,nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }
    public LocalDate getTahunMasuk() { return tahunMasuk; }
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }
    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja > 10) return gaji * 0.15;
        if (lamaBekerja >= 5) return gaji * 0.10;
        return gaji * 0.05;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20.0);
    }

    @Override
    public double getPendapatan() {
        return gaji + getTunjangan() + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() +
               "\ntahun masuk : " + tahunMasuk.getDayOfMonth() + " " +
                   tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() +
               "\njumlah anak : " + jumlahAnak +
               "\ngaji : " + gaji;
    }
}

