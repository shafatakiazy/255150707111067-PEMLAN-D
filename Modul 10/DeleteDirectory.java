import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        var dir = new File("C:/Data"); // sesuaikan direktorimu
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (var file : files) {
                    file.delete(); // hapus tiap file satu per satu
                }
            }
            var result = dir.delete(); // baru hapus direktorinya
            System.out.println((result ? "Berhasil" : "Gagal") + " menghapus direktori");
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}