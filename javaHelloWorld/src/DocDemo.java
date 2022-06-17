/**
 * JAVA DOC ÖRNEĞİ
 *
 * @author aebru&bcan
 * @since 16.12.2021
 */
public class DocDemo {

    /**
     * İşlemlerin sonuçlarının tutulacağı değişken
     */
    int sonuc;

    /**
     * @param sayi1 sonuc değişkeni için gereken birinci sayı
     * @param sayi2 sonuc değişkeni için gereken ikinci sayı
     * @return dönen bir değer yok
     */
    public void topla(int sayi1, int sayi2) {
        sonuc = sayi1 + sayi2;
        System.out.println("TOPLAMA ISLEMI SONUCU =" + sonuc);
    }

    /**
     *
     * @param sayi1 çıkarılan sayı
     * @param sayi2 çıkarılması istenen sayı
     * @return dönen bir değer yok
     */
    public void cikar(int sayi1, int sayi2) {
        sonuc = sayi1 - sayi2;
        System.out.println("CIKARMA ISLEMI SONUCU =" + sonuc);
    }

    /**
     * Bu metot gelen değerleri çarpıp sonuc değişkenine döndürür.
     *
     * @param sayi1 çarpılan sayı1
     * @param sayi2 çarpılan sayı2
     * @return çarpım değer sonucunu döndürür.
     */
    public int carp(int sayi1, int sayi2) {
        sonuc = sayi1 * sayi2;
        return sonuc;
    }

    /**
     * Bu metod bölme işlemi yapar
     *
     * @param sayi1 bölünen sayı
     * @param sayi2 bölen sayı
     * @return bölüm değerinin sonucunu döndürür.
     */
    public int bolme(int sayi1, int sayi2) {
        sonuc = sayi1 / sayi2;
        return sonuc;
    }

    /**
     * Bu metod main ana metodudur.
     * @param args
     *
     */
    public static void main(String[] args) {
        DocDemo hesap = new DocDemo();
        System.err.println("  UYGULAMA ÇALIŞTI. ");
    }
}
