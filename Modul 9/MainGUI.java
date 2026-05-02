import java.awt.*;
import java.awt.event.*;

public class MainGUI extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHitung, btnTampil;
    TextArea area;

    CheckboxGroup cbg;
    Checkbox cbPemlan, cbASD, cbMatkomlan, cbProbstat;

    double hasilPemlan=0, hasilASD=0, hasilMatkomlan=0, hasilProbstat=0;

    public MainGUI(){
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        add(lbJudul);
        lbJudul.setBounds(120, 30, 200, 20);

        // Radio Button
        cbg = new CheckboxGroup();
        cbPemlan = new Checkbox("Pemlan", cbg, true);
        cbASD = new Checkbox("ASD", cbg, false);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        cbProbstat = new Checkbox("Probstat", cbg, false);

        add(cbPemlan); cbPemlan.setBounds(50, 60, 80, 20);
        add(cbASD); cbASD.setBounds(130, 60, 60, 20);
        add(cbMatkomlan); cbMatkomlan.setBounds(190, 60, 90, 20);
        add(cbProbstat); cbProbstat.setBounds(280, 60, 80, 20);

        ItemListener clearField = e -> {
            txtTugas.setText("");
            txtKuis.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            txtHasil.setText("");
        };

        cbPemlan.addItemListener(clearField);
        cbASD.addItemListener(clearField);
        cbMatkomlan.addItemListener(clearField);
        cbProbstat.addItemListener(clearField);

        // Label
        lbTugas = new Label("Tugas"); add(lbTugas); lbTugas.setBounds(100,100,80,20);
        lbKuis = new Label("Kuis"); add(lbKuis); lbKuis.setBounds(100,130,80,20);
        lbUTS = new Label("UTS"); add(lbUTS); lbUTS.setBounds(100,160,80,20);
        lbUAS = new Label("UAS"); add(lbUAS); lbUAS.setBounds(100,190,80,20);
        lbHasil = new Label("Hasil"); add(lbHasil); lbHasil.setBounds(100,220,80,20);

        // TextField
        txtTugas = new TextField(); add(txtTugas); txtTugas.setBounds(200,100,80,20);
        txtKuis = new TextField(); add(txtKuis); txtKuis.setBounds(200,130,80,20);
        txtUTS = new TextField(); add(txtUTS); txtUTS.setBounds(200,160,80,20);
        txtUAS = new TextField(); add(txtUAS); txtUAS.setBounds(200,190,80,20);
        txtHasil = new TextField(); add(txtHasil); txtHasil.setBounds(200,220,80,20);

        // Button
        btnHitung = new Button("Hitung");
        add(btnHitung); btnHitung.setBounds(150, 260, 100, 25);

        btnTampil = new Button("Tampilkan semua matkul");
        add(btnTampil); btnTampil.setBounds(120, 420, 180, 25);

        // TextArea
        area = new TextArea();
        add(area);
        area.setBounds(80, 300, 250, 100);

        // Event Hitung
        btnHitung.addActionListener(e -> {
            double t = Double.parseDouble(txtTugas.getText());
            double k = Double.parseDouble(txtKuis.getText());
            double uts = Double.parseDouble(txtUTS.getText());
            double uas = Double.parseDouble(txtUAS.getText());

            double hasil = 0;

            if (cbPemlan.getState()) {
                Pemlan p = new Pemlan();
                hasil = p.hitung(t,k,uts,uas);
                hasilPemlan = hasil;
            } 
            else if (cbASD.getState()) {
                ASD a = new ASD();
                hasil = a.hitung(t,k,uts,uas);
                hasilASD = hasil;
            } 
            else if (cbMatkomlan.getState()) {
                Matkomlan m = new Matkomlan();
                hasil = m.hitung(t,k,uts,uas);
                hasilMatkomlan = hasil;
            } 
            else if (cbProbstat.getState()) {
                Probstat p = new Probstat();
                hasil = p.hitung(t,k,uts,uas);
                hasilProbstat = hasil;
            }

            txtHasil.setText(String.valueOf(hasil));
        });

        // Event tampil semua
        btnTampil.addActionListener(e -> {
            area.setText("HASIL NILAI SEMUA MATA KULIAH\n\n");
            area.append("Pemlan : " + hasilPemlan + "\n");
            area.append("ASD : " + hasilASD + "\n");
            area.append("Matkomlan : " + hasilMatkomlan + "\n");
            area.append("Probstat : " + hasilProbstat + "\n");
        });
    }

    public static void main(String[] args) {
        MainGUI f = new MainGUI();
        f.setSize(420, 500);
        f.setVisible(true);
    }
}