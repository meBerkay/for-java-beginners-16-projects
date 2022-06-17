/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author bcano
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char not = 'A';

        switch (not) {
            case 'A':
                System.out.println("Başarıyla geçtiniz.");
                break;
            case 'B':
                System.out.println("Normal geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi geçtiniz.");
                break;
            case 'D':
                System.out.println("Geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }

}
