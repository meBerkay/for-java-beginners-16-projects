/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap.demo;

/**
 *
 * @author bcano
 */
public class RecapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 25;
        int sayi3 = 2;
        int enbuyuk= sayi1;
        
       
        if(enbuyuk<sayi3)
        {
            enbuyuk=sayi3;
            
        }
         if(enbuyuk<sayi2)
        {
            enbuyuk=sayi2;
        }
        System.out.println(" En büyük değer : "+ enbuyuk);
    }
    
}
