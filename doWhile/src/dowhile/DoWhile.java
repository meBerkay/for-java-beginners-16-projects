/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author bcano
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i=0;
        do{
          
            System.out.println(i);
            i+=2;
        }
        while (i<10);
        System.out.println("Do-While Döngüsü Bitti");
                
    }
    
}
