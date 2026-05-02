import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDaftar extends JFrame {

    JTextField tfNama, tfTanggal, tfNomor, tfTelp, tfEmail;
    JTextArea tfAlamat;
    JButton btnSubmit;

    public FormDaftar() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel lblJudul = new JLabel("Form Pendaftaran Mahasiswa Baru", SwingConstants.CENTER);
        lblJudul.setFont(new Font("Arial", Font.BOLD, 16));
        lblJudul.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        add(lblJudul, BorderLayout.NORTH);

        JPanel panelForm = new JPanel(new GridLayout(6, 2, 10, 12));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        tfNama    = new JTextField();
        tfTanggal = new JTextField();
        tfNomor   = new JTextField();
        tfTelp    = new JTextField();
        tfAlamat  = new JTextArea(3, 20);
        tfEmail   = new JTextField();

        panelForm.add(new JLabel("Nama Lengkap"));    panelForm.add(tfNama);
        panelForm.add(new JLabel("Tanggal Lahir"));   panelForm.add(tfTanggal);
        panelForm.add(new JLabel("Nomor Pendaftaran"));panelForm.add(tfNomor);
        panelForm.add(new JLabel("No. Telp"));        panelForm.add(tfTelp);
        panelForm.add(new JLabel("Alamat"));          panelForm.add(new JScrollPane(tfAlamat));
        panelForm.add(new JLabel("E-mail"));          panelForm.add(tfEmail);

        add(panelForm, BorderLayout.CENTER);

        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 13));
        JPanel panelBtn = new JPanel(new FlowLayout(FlowLayout.RIGHT, 30, 10));
        panelBtn.add(btnSubmit);
        add(panelBtn, BorderLayout.SOUTH);

        btnSubmit.addActionListener(e -> {
            // cek semua field terisi
            if (tfNama.getText().trim().isEmpty() || tfTanggal.getText().trim().isEmpty() ||
                tfNomor.getText().trim().isEmpty() || tfTelp.getText().trim().isEmpty()   ||
                tfAlamat.getText().trim().isEmpty()|| tfEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // konfirmasi
            int pilihan = JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin data yang Anda isi sudah benar?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

            if (pilihan == JOptionPane.OK_OPTION) {
                new HasilData(
                    tfNama.getText(), tfTanggal.getText(), tfNomor.getText(),
                    tfTelp.getText(), tfAlamat.getText(), tfEmail.getText()
                );
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormDaftar();
    }
}

