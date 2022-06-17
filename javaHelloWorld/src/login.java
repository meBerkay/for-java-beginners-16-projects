
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class login extends JFrame implements ActionListener {

    public static void main(String[] args) {

        login frame = new login();
        frame.setTitle("TEST GİRİŞ EKRANI");
        frame.setVisible(true);
        frame.setBounds(500, 250, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
    Container panelAna = getContentPane();
    JButton buton;
    JPanel panel;
    JLabel yoneticiAd, sifreBolumu;
    final JTextField yaziAlani, yaziAlani2;

    login() {
        panelAna.setLayout(null);
        yoneticiAd = new JLabel();
        yoneticiAd.setText("Kullanıcı Adı");
        yoneticiAd.setBounds(50, 75, 100, 30);

        yaziAlani = new JTextField(15);
        yaziAlani.setBounds(200, 250, 150, 30);

        sifreBolumu = new JLabel();
        sifreBolumu.setText("Şifre");

        yaziAlani2 = new JPasswordField(15);

        buton = new JButton("Gönder");

        panel = new JPanel(new GridLayout(3, 1));
        panelAna.add(yoneticiAd);
        panelAna.add(yaziAlani);
        panelAna.add(sifreBolumu);
        panelAna.add(yaziAlani2);
        panelAna.add(buton);

        add(panel, BorderLayout.CENTER);

        buton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = yaziAlani.getText();
        String passValue = yaziAlani2.getText();

        if (userValue.equals("a") && passValue.equals("b")) {
            JOptionPane.showMessageDialog(this, "Giriş Başarılı");
        } else {
            JOptionPane.showMessageDialog(this, "Giriş Başarısız - Ters Giden Birşeyler Oldu Sanki?");

        }
    }

}
