package javaproje;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class QuizUygulamasi extends JFrame {
 /**
 * Bu sınıf rastgele soru sorduran ve cevaplarını test sonunda listeler.
 * @author bcan&aebru
 * @version 1.0.0
 * @since 20-12-2021
 */
    
    
    KonuSorulari sorular[];    
    KonuSorulari siradakiSoru;
    JPanel anaPanel;    
    static JTextPane txtSoru;
    static JLabel lblA;
    static JLabel lblB;
    static JLabel lblC;
    static JLabel lblD;
    String cevaplar = "";    
    JButton btnA;
    JButton btnB;
    JButton btnC;
    JButton btnD;
    JButton btnSonraki;
    JButton btnJokerSoru;
    JButton btnTestiYenidenBaslat;
    static int rastgeleSoruNumara = 0;
    int[] rastgele;

    public QuizUygulamasi() {

        rastgele = rastgeleSayilar();
        sorular = new SoruKayitlari().getSoruDeposu();
        siradakiSoru = sorular[rastgele[rastgeleSoruNumara]];
        this.setTitle("Quiz Uygulaması   -  v1.0.0"); //PENCERE BAŞLIK ADI
        this.setSize(560, 370);  // PENCERENİN BOYUTUNU BELİRTİR
        this.setLocation(600, 300);  // PENCERENİN KONUMUNU BELİRTİR
        AraclariEkle(this.getContentPane());
        this.setLayout(null); // BOYUT AYARLAMASI YAPMAK İÇİN NULL DEĞER ATIYORUZ.
        this.setVisible(true);  // JFRAME'in GÖRÜNÜRLÜĞÜNÜ AKTİF EDİYORUZ.
        this.setResizable(false);  // YENİDEN BOYUTLANDIRILABİLMEYİ DEVRE DIŞI BIRAKIYORUZ.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void AraclariEkle(Container gorunenFrame) {

        anaPanel = new JPanel(null);
        anaPanel.setSize(825, 650);
        anaPanel.setLocation(0, 0);
        anaPanel.setBackground(new Color(86, 150, 213));
        gorunenFrame.add(anaPanel);

        txtSoru = new JTextPane();
        txtSoru.setSize(500, 70);
        txtSoru.setEditable(false);
        txtSoru.setForeground(new Color(90, 0, 0));
        txtSoru.setText(siradakiSoru.getSoru());
        txtSoru.setBackground(new Color(255, 255, 255));
        txtSoru.setLocation(40, 50);

        lblA = new JLabel(siradakiSoru.getASecenegi());
        lblA.setSize(500, 20);
        lblA.setLocation(100, 150);

        lblB = new JLabel(siradakiSoru.getBSecenegi());
        lblB.setSize(500, 20);
        lblB.setLocation(100, 180);

        lblC = new JLabel(siradakiSoru.getCSecenegi());
        lblC.setSize(500, 20);
        lblC.setLocation(100, 210);

        lblD = new JLabel(siradakiSoru.getDSecenegi());
        lblD.setSize(500, 20);
        lblD.setLocation(100, 240);

        anaPanel.add(txtSoru);
        anaPanel.add(lblA);
        anaPanel.add(lblB);
        anaPanel.add(lblC);
        anaPanel.add(lblD);

        btnA = new JButton("A-)");
        btnA.setSize(50, 30);
        btnA.setLocation(40, 150);
        btnB = new JButton("B-)");
        btnB.setLocation(40, 180);
        btnB.setSize(50, 30);
        btnC = new JButton("C-)");
        btnC.setLocation(40, 210);
        btnC.setSize(50, 30);
        btnD = new JButton("D-)");
        btnD.setLocation(40, 240);
        btnD.setSize(50, 30);

        btnSonraki = new JButton("İlerle");
        btnSonraki.setSize(150, 30);
        btnSonraki.setLocation(390, 270);
        btnSonraki.setEnabled(false);

        btnJokerSoru = new JButton("Joker Soru Değiştir");
        btnJokerSoru.setSize(150, 30);
        btnJokerSoru.setLocation(390, 300);
        
        btnTestiYenidenBaslat = new JButton("Testi Yeniden Başlat");
        btnTestiYenidenBaslat.setSize(150, 30);
        btnTestiYenidenBaslat.setLocation(390, 240);

        btnA.setBackground(new Color(240, 240, 240));
        btnB.setBackground(new Color(240, 240, 240));
        btnC.setBackground(new Color(240, 240, 240));
        btnD.setBackground(new Color(240, 240, 240));

        anaPanel.add(btnA);
        anaPanel.add(btnB);
        anaPanel.add(btnC);
        anaPanel.add(btnD);
        anaPanel.add(btnSonraki);
        anaPanel.add(btnJokerSoru);
        anaPanel.add(btnTestiYenidenBaslat);
        
        btnA.addActionListener(new ActionListener() {
            /**
             * A şıkkı dizide karşılaştırılan değer ile aynı ise ilgili butonu YEŞİL, yanlış ise KIRMIZI'ya boyar.
             * @param e 
             */            
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPasiflestir();
                if (soruCoz("A")) {
                    btnA.setBackground(Color.GREEN);//DOĞRUYSA BUTONU YEŞİLE BOYA
                } else {
                    btnA.setBackground(Color.RED);//YANLIŞSA BUTONU KIRMIZIYA BOYA
                }
            }
        });

        btnB.addActionListener(new ActionListener() {
             /**
             * B şıkkı dizide karşılaştırılan değer ile aynı ise ilgili butonu YEŞİL, yanlış ise KIRMIZI'ya boyar.
             * @param e 
             */      
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPasiflestir();
                if (soruCoz("B")) {
                    btnB.setBackground(Color.GREEN);//DOĞRUYSA BUTONU YEŞİLE BOYA
                } else {
                    btnB.setBackground(Color.RED);//YANLIŞSA BUTONU KIRMIZIYA BOYA
                }
            }
        });

        btnC.addActionListener(new ActionListener() {
            /**
             * C şıkkı dizide karşılaştırılan değer ile aynı ise ilgili butonu YEŞİL, yanlış ise KIRMIZI'ya boyar.
             * @param e 
             */    
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPasiflestir();
                if (soruCoz("C")) {
                    btnC.setBackground(Color.GREEN);//DOĞRUYSA BUTONU YEŞİLE BOYA
                } else {
                    btnC.setBackground(Color.RED);//YANLIŞSA BUTONU KIRMIZIYA BOYA
                }
            }
        });

        btnD.addActionListener(new ActionListener() {
            /**
             * D şıkkı dizide karşılaştırılan değer ile aynı ise ilgili butonu YEŞİL, yanlış ise KIRMIZI'ya boyar.
             * @param e 
             */    
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPasiflestir();
                if (soruCoz("D")) {
                    btnD.setBackground(Color.GREEN); //DOĞRUYSA BUTONU YEŞİLE BOYA
                } else {
                    btnD.setBackground(Color.RED);   //YANLIŞSA BUTONU KIRMIZIYA BOYA
                }
            }
        });

        btnSonraki.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (rastgeleSoruNumara < 4) {
                    rastgeleSoruNumara++;
                    if (rastgeleSoruNumara == 4) {
                        btnSonraki.setText("Testi Bitir");
                    }

                    siradakiSoru = sorular[rastgele[rastgeleSoruNumara]];
                    txtSoru.setText(rastgeleSoruNumara + 1 + "- "+siradakiSoru.getSoru());
                    lblA.setText(siradakiSoru.getASecenegi());
                    lblB.setText(siradakiSoru.getBSecenegi());
                    lblC.setText(siradakiSoru.getCSecenegi());
                    lblD.setText(siradakiSoru.getDSecenegi());

                    btnA.setBackground(new Color(240, 240, 240));
                    btnB.setBackground(new Color(240, 240, 240));
                    btnC.setBackground(new Color(240, 240, 240));
                    btnD.setBackground(new Color(240, 240, 240));

                    btnAktiflestir();

                } else {
                    JOptionPane.showMessageDialog(null,"Doğru - Yanlış Analizi \n\n" + cevaplar+"\n Puanınız :"+ puan*20 +" / 100 ","TEST SONUCUNUZ HAZIR!",1);
                    btnTestiYenidenBaslat.setEnabled(true);                    
                    btnSonraki.setEnabled(false);
                }
            }
        });

        btnJokerSoru.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Soru değiştirildi! \n Şıklardan birini işaretlediğinizde buton pasif hale gelecektir.","Bilgilendirme!",1);
                System.err.println("Birisi joker tuşuna bastı...");
                setVisible(false);
                boolean yenidenBaslat;
                do {
                    yenidenBaslat = new QuizUygulamasi().baslat();
                } while (yenidenBaslat);
                
            }
        });
        
        btnTestiYenidenBaslat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Test yeniden başlatıldı. Başarılar","Bilgilendirme!",1);
                System.err.println("Test yeniden başladı...");
                setVisible(false);
                QuizUygulamasi frame = new QuizUygulamasi();
                frame.setVisible(true);
                rastgeleSoruNumara=0;
                puan=0;
            }
        });

    }
    
    int puan = 0; // puan DEĞİŞKENİNE 0 ATANDI.
   
    private boolean soruCoz(String cevap) {

        boolean bool = false;
       
        if (cevap.equals(siradakiSoru.getCevap())) {

            cevaplar += rastgeleSoruNumara + 1 + ".Soru Doğru\n";
            bool = true;           
            for (int i = 0; i < 1; i++) { //PUAN DEĞİŞKENİNİ ATAYARAK HER BİR DOĞRU CEVAPTA, puan DEĞİŞKENİNİ 1 ARTTIRMASINI SAĞLADIK.
                puan++;                
            }
            
        } else {
            
            cevaplar += rastgeleSoruNumara + 1 + ".Soru Yanlış ---> Cevap: " + siradakiSoru.getCevap() + "\n";             
                        
            String dogruCevap = siradakiSoru.getCevap();
            if ("A".equals(dogruCevap)) {
                btnA.setBackground(Color.green);
            } else if ("B".equals(dogruCevap)) {
                btnB.setBackground(Color.green);
            } else if ("C".equals(dogruCevap)) {
                btnC.setBackground(Color.green);
            } else if ("D".equals(dogruCevap)) {
                btnD.setBackground(Color.green);
            }
        }

        System.out.println(cevaplar);

        return bool;
    }

    public static void main(String[] args) {
        /**
         * Main class içinden uygulamayı çağırıyoruz.
         */
        QuizUygulamasi mainSoru = new QuizUygulamasi();

    }

    private static int[] rastgeleSayilar() {

        int sayilar[] = new int[5];
        sayilar[0] = (int) (Math.random() * 17);

        for (int i = 1; i < 5; i++) {
            sayilar[i] = (int) (Math.random() * 19);

            for (int j = 0; j < i; j++) {
                if (sayilar[i] == sayilar[j]) {
                    i--;
                    break;
                }
            }
        }

        return sayilar;
    }

    private void btnAktiflestir() {

        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnSonraki.setEnabled(false);
    }

    private void btnPasiflestir() {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnJokerSoru.setEnabled(false);
        btnTestiYenidenBaslat.setEnabled(false);
        btnSonraki.setEnabled(true);

    }

    private boolean baslat() {
         
        System.err.println("  Soru rastgele değiştirildi...");
        return false;
    }
}

class SoruKayitlari {

    KonuSorulari[] soruDeposu = new KonuSorulari[20];

    public SoruKayitlari() {
        /**
         * El ile soru kayıtlarını sıralı dizinlerine eklendi.
         */
        soruDeposu[0] = new KonuSorulari("Java'da dizini belirtirken hangisini kullanırız?",
                "\\", 
                "/",
                "//",
                "/-",
                "A");
        soruDeposu[1] = new KonuSorulari("SELAM kelimesi kaç harflidir?",
                "4",
                "6",
                "5",
                "10",
                "C");
        soruDeposu[2] = new KonuSorulari("Ortak platformlarda kullanılabilen yazılım dili aşağıdakilerden hangisidir?", 
                "Java",
                "C#",
                "C++",
                "Phyton",
                "A");
        soruDeposu[3] = new KonuSorulari(
                "I. PHP\nII. HTML\nIII. JAVA \nYukarıdakilerden hangisi birlikte kullanılabilir?",
                "Yalnız I",
                "I, II, III",
                "II ve III",
                "Yalnız III",
                "B");
        soruDeposu[4] = new KonuSorulari(
                "Türkiye'nin başkenti aşağıdakilerden hangisidir??",
                "Ankara",
                "İstanbul",
                "İzmir", 
                "Eminönü",
                "A");
        soruDeposu[5] = new KonuSorulari(
                "Sistemin temel bileşenlerinden olan ve bir sistemi diğerlerinden ya da çevresinden ayıran alan aşağıda verilmiş seçeneklerden hangisidir?",
                "Sistemin tekrarı",
                "Sistemin sonu",
                "Sistemin başlangıcı",
                "Sistemin sınırı",
                "D");
        soruDeposu[6] = new KonuSorulari(
                "Aşağıda verilmiş olan seçeneklerden hangisi sistem olarak adlandırılan tüm kavramların ortak noktalarından birisi değildir?",
                "Öge", 
                "Özellik", 
                "Diyagram",
                "Faaliyet",
                "C");
        soruDeposu[7] = new KonuSorulari(
                "Sistemler büyüklükleri açısından ele alındığında Sistemlerin bir araya getirerek oluşturduğu yapı aşağıda verilmiş olan ifadelerden hangisidir?",
                "Alt Sistem",
                "Süper Sistem",
                "Üst Sistem",
                "Sınır Sistem",
                "B");
                
        soruDeposu[8] = new KonuSorulari(
                "Sistemin gerçekleştirilmesi için ihtiyaç duyulan kaynakların belirlendiği Sistem geliştirme yaşam döngüsü aşağıda verilmiş olan ifadelerden hangisidir?",
                "Tasarım",
                "Ön İnceleme",
                "Analiz",
                "Uygulama",
                "B");
        soruDeposu[9] = new KonuSorulari(
                "Bir sonraki aşamaya geçmek için, bir önceki aşamanın tamamlanması gerektiği ve bir sonraki aşamaya" +
                " geçmeden, içinde bulunulan aşamanın tüm dokümanları hazırlandığı Sistem geliştirme modeli" +
                " aşağıdakilerden hangisidir?",
                "U Modeli",
                "V Modeli",
                "Şelale Modeli",
                "Sarmal Model",
                "C");
        soruDeposu[10] = new KonuSorulari(
                "Fizibilite çalışması sırasında önerilen sistemin kullanıcılar tarafından kabul edilip edilmeyeceğinin araştırıldığı fizibilite türü aşağıdakilerden hangisidir?",
                "Teknik fizibilite",
                "Yasal fizibilite",
                "Zaman fizibilite",
                "Kültürel fizibilite", 
                "D");
        soruDeposu[11] = new KonuSorulari(
                "Aşağıdakilerden hangisi JavaDoc'da classı yazan kişinin adının başına  yazılan metotdur?",
                "@author",
                "{@code...}",
                "@exceptio",
                "@param", 
                "A");
        soruDeposu[12] = new KonuSorulari(
                "Aşağıdakilerden hangisi  değişken tipleri ve bu değişkenlerin açıklamasında kullanılan javaDoc methodudur?",
                "@author",
                "{@code...}",
                "@exceptio",
                "@param", 
                "D");
        soruDeposu[13] = new KonuSorulari(
                "Java dili yazım kuralları olarak hangi programlama dilinin gramer yapısını kullanır?",
                "Pascal",
                "Basıc",
                "C",
                "Php", 
                "C");
        soruDeposu[14] = new KonuSorulari(
                "Bir java editörü ile yazdığımız kaynak dosyamızı (.java uzantılı) derlediğimizde (javac ile) dosya uzantımız ne olur? ",
                ".java",
                ".jar",
                ".class",
                ".sdk",
                "C");
        soruDeposu[15] = new KonuSorulari(
                "Java dili günümüzde hangi firma tarafından geliştirilmektedir",
                "Microchip",
                "Oracle",
                "Sun System",
                "IEEE",
                "B");

        soruDeposu[16] = new KonuSorulari(
                "Aşağıdakilerden hangisi Jave editör programı değildir?",
                "JCreator",
                "NetBeans",
                "JBuilder",
                "JDK", 
                "D");


        soruDeposu[17] = new KonuSorulari(
                "Java programlama dilinde yazılan bir kaynak programın uzantısı nedir?",
                ".exe",
                ".asm",
                ".java",
                ".jar",
                "C");
       for (int i = 17; i < 20; i++) {
            soruDeposu[i] = soruDeposu[i - 1];
        }
        

    }

    public KonuSorulari[] getSoruDeposu() {
        return soruDeposu;
    }

}

class KonuSorulari {

    String soru;
    String siklarA;
    String siklarB;
    String siklarC;
    String siklarD;
    String cevap;

    public KonuSorulari(String soru, String siklarA, String siklarB, String siklarC,
            String siklarD, String cevap) {
        super();
        this.soru = soru;
        this.siklarA = siklarA;
        this.siklarB = siklarB;
        this.siklarC = siklarC;
        this.siklarD = siklarD;
        this.cevap = cevap;
    }

    public String getSoru() {
        return soru;
    }

    public String getASecenegi() {
        return siklarA;
    }

    public String getBSecenegi() {
        return siklarB;
    }

    public String getCSecenegi() {
        return siklarC;
    }

    public String getDSecenegi() {
        return siklarD;
    }

    public String getCevap() {
        return cevap;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public void setSiklarA(String siklarA) {
        this.siklarA = siklarA;
    }

    public void setSiklarB(String siklarB) {
        this.siklarB = siklarB;
    }

    public void setSiklarC(String siklarC) {
        this.siklarC = siklarC;
    }

    public void setSiklarD(String siklarD) {
        this.siklarD = siklarD;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

}
