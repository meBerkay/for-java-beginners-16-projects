package javaproje;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GirisEkran extends JFrame implements ActionListener {

    /**
     * Bu sınıf giris ekranını yansıtır ve tanımlı olan kullanıcı bilgisi doğru
     * ise QuizUygulamasi formuna yönlendirir.
     *
     * @author bcan&aebru
     * @version 1.0.0
     * @since 20-12-2021
     */
    Container icerik = getContentPane();
    JLabel kullaniciAdi = new JLabel("KULLANICI ADI");
    JLabel kullaniciSifre = new JLabel("ŞİFRE");
    JTextField kullaniciYaziAlani = new JTextField();
    JPasswordField kullaniciSifreAlani = new JPasswordField();
    JButton girisButon = new JButton("GİRİŞ YAP");
    JButton resetButon = new JButton("TEMİZLE");
    JCheckBox parolayiGoster = new JCheckBox("Şifreyi Göster");

    GirisEkran() {
        boyutlandirmaAyari();
        lokasyonVeBoyutAyari();
        bilesenleriEkle();
        ekleActionEvent();
    }

    public void boyutlandirmaAyari() {
        icerik.setLayout(null);
    }

    /**
     * Buton,label ve şifre karakter nesnelerinin boyut ve lokasyon ayarlaması
     * yapıldı.
     */
    public void lokasyonVeBoyutAyari() {
        kullaniciAdi.setBounds(50, 75, 100, 30);
        kullaniciSifre.setBounds(50, 125, 100, 30);
        kullaniciYaziAlani.setBounds(150, 75, 150, 30);
        kullaniciSifreAlani.setBounds(150, 125, 150, 30);
        parolayiGoster.setBounds(150, 160, 150, 30);
        girisButon.setBounds(50, 250, 100, 30);
        resetButon.setBounds(200, 250, 100, 30);

    }

    /**
     * Bileşenler icerik methodunun içerisine eklendi.
     */
    public void bilesenleriEkle() {
        icerik.add(kullaniciAdi);
        icerik.add(kullaniciSifre);
        icerik.add(kullaniciYaziAlani);
        icerik.add(kullaniciSifreAlani);
        icerik.add(parolayiGoster);
        icerik.add(girisButon);
        icerik.add(resetButon);
    }

    /**
     * Action event kısımları eklendi.
     */
    public void ekleActionEvent() {
        girisButon.addActionListener(this);
        resetButon.addActionListener(this);
        parolayiGoster.addActionListener(this);
    }

    public static void main(String[] args) {

        GirisEkran frame = new GirisEkran();
        frame.setTitle("TEST GİRİŞ EKRANI");
        frame.setVisible(true);
        frame.setBounds(500, 250, 370, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

    /**
     * Giriş butonuna tıklandığında text alanlarına girilen kullanıcı adı ve
     * şifre bilgileri, kayıt olan k_Adi ve k_Sifre ile eşit ise giriş izni
     * vererek diğer frame formuna geçecek.
     *
     * @param e Eğer eşit değil ise, mesaj diyalogu gösterecek.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == girisButon) {
            String k_Adi;
            String k_Sifre;
            k_Adi = kullaniciYaziAlani.getText();
            k_Sifre = kullaniciSifreAlani.getText();
//            if (k_Adi.equalsIgnoreCase("kullanici") && k_Sifre.equalsIgnoreCase("kullanici123")) {      //BÜYÜK KÜÇÜK DUYARLILIĞI KALDIRIR
            if (k_Adi.equals("kullanici") && k_Sifre.equals("kullanici123")) {
                JOptionPane.showMessageDialog(this, "Giriş Başarılı, Yönlendiriliyorsunuz.","İşlem Durumu",1);
                QuizUygulamasi frame = new QuizUygulamasi();
                frame.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Geçersiz Kullanıcı Adı / Şifre","İşlem Durumu",1);
            }
            /**
             * @param e eğer gelen kaynak resetButon'a eşitse yazı ve şifre
             * alanını boşluk ile değiştir.
             */
        }
        if (e.getSource() == resetButon) {
            kullaniciYaziAlani.setText("");
            kullaniciSifreAlani.setText("");
        }
        /**
         * @param e Gelen kaynak, parolayiGoster checkbox değerine eşitse,
         * alandaki * olarak gözüken şifreyi normal okunabilir hale char yöntemi
         * ile değiştirilir.
         */
        if (e.getSource() == parolayiGoster) {
            if (parolayiGoster.isSelected()) {
                kullaniciSifreAlani.setEchoChar((char) 0);
            } else {
                kullaniciSifreAlani.setEchoChar('*');
            }

        }
    }

}
