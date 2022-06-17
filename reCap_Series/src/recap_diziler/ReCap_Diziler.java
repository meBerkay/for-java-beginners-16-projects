/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap_diziler;

/**
 *
 * @author bcano
 */
public class ReCap_Diziler {

    /**
     * @param args the command line arguments
     */
     
 
 public static void main(String args[]) {
    // Creating a list of elements
     double [] diziler = {1.1,1.2,1.3,1.4,1.6};
     double toplam=0;
     double max = diziler[0];
     for ( double sayi:diziler)
     {
         if(max<sayi)
         {
             max = sayi;
         }
         toplam = toplam + sayi;
         System.out.println("Sayı : "+sayi);
     }
     System.out.println("Toplam değeriniz "+toplam);
     System.out.println("Max Sayı ="+max);
 }
 

    
}
