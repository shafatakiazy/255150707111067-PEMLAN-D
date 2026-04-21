public class Tumbuhan implements MakhlukHidup {
    private String jenis;

    public Tumbuhan(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan " + jenis + " makan melalui proses fotosintesis");
    }
    @Override
    public void berjalan() {
        System.out.println("Tumbuhan " + jenis + " tidak bisa berjalan, hanya tumbuh ke atas");
    }
    @Override
    public void bersuara() {
        System.out.println("Tumbuhan " + jenis + " tidak bisa bersuara");
    }
}

