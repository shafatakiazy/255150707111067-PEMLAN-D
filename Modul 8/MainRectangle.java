public class MainRectangle{
    public static void main(String[] args) {

        Rectangle kotak1 = new Rectangle("merah");
        Rectangle kotak2 = new Rectangle();
        Rectangle kotak3 = new Rectangle();
        kotak1.howToColor();
        kotak2.howToColor();
        kotak3.compareTo(4);

        Colorable c = new Rectangle("biru");
        c.howToColor();

        Rectangle kotak4 = new Rectangle("hijau");
        Rectangle kotak5 = new Rectangle();
        kotak4.howToColor();  
        kotak5.compareTo(0);   
    }
}