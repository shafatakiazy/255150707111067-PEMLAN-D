import javax.swing.*;
import java.awt.*;

public class HasilData extends JFrame {

    public HasilData(String nama, String tgl, String nomor, String telp, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(420, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel lblJudul = new JLabel("Data Mahasiswa", SwingConstants.CENTER);
        lblJudul.setFont(new Font("Arial", Font.BOLD, 15));
        lblJudul.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        add(lblJudul, BorderLayout.NORTH);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Arial", Font.PLAIN, 13));
        area.setMargin(new Insets(10, 10, 10, 10));
        area.setText(
            "Nama             : " + nama    + "\n" +
            "Tanggal Lahir    : " + tgl     + "\n" +
            "No. Pendaftaran  : " + nomor   + "\n" +
            "No. Telp         : " + telp    + "\n" +
            "Alamat           : " + alamat  + "\n" +
            "E-mail           : " + email
        );

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 20, 20, 20),
            BorderFactory.createLineBorder(Color.GRAY)
        ));
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
