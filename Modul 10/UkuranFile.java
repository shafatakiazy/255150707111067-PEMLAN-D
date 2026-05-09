import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        var file = new File("test.txt"); 
        if (file.exists()) {
            long bytes = file.length();
            if (bytes < 1_000_000) {
                double kb = bytes / 1000.0;
                System.out.printf("Ukuran file: %.2f KB%n", kb);
            } else {
                double mb = bytes / 1_000_000.0;
                System.out.printf("Ukuran file: %.2f MB%n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}