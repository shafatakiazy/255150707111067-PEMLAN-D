public class Rectangle implements Colorable, MyComparable {
    private String warna;
    private int kategori;

    public Rectangle() {}
    public Rectangle(String warna) {
        this.warna = warna;
    }

    @Override
    public void howToColor() {
        if (this.warna == null) {
            System.out.println("Tidak ada warna, warna bangun kotak masih polos");
        } else {
            System.out.println("Bangun kotak sudah diwarnai dengan warna " + this.warna);
        }
    }

    @Override
    public void compareTo(Object obj) {
        this.kategori = (Integer) obj;
        if (this.kategori == 0) {
            System.out.println("Ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori " + this.kategori + " yaitu 2.5L");
        } else {
            System.out.println("Ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori " + this.kategori + " yaitu 6.5L");
        }
    }
}
