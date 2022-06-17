/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aranacakdemo;

/**
 *
 * @author bcano
 */
public class AranacakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int [] rakamlar = {0,1,2,3,4,5,6,7,8,9};
   int ara=1;
   boolean varMi=true;
   for(int rakam:rakamlar)
   {
       if(ara==rakam)
       {
           varMi=true;
           break;
       }
       else{
           varMi=false;
           
       }
   }
   if(varMi==true){
       System.out.println("Aranan rakam bulundu : "+ara);
   }
   else{
       System.out.println("Aranan rakam bulunamadı.");
   }
    }
    
}
