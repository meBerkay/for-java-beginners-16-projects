/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizilerdemo;

/**
 *
 * @author bcano
 */
public class DizilerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] sayilar = { 0,1,2,3,4,5,6,7};
     
       
       int bulundu=0;
               int ara = 9;
              for ( int rakam:sayilar)
              {
                  if ( ara == rakam){
                      
                      bulundu = ara;
                  break;
                  }
              }
             
               if(bulundu==ara)
               {
                   System.out.println("İstenilen sayı bulundu = "+bulundu);
               }
               else 
               {
                   System.out.println("İstenilen sayı bulunamadı");
               }
    }
    
}
