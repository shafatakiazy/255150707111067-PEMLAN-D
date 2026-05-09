import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var dir = new File("C:/BacaFile2"); // sesuaikan dengan direktorimu
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (var file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}