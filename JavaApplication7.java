
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("Masukkan Simbol Anda");
        
        //Mengambil simbol pertama dari input
        char simbol = inp.next().charAt(0);
        
        switch (simbol){
            case '+':
                System.out.println("Tanda Penjumlahan");
                break;
                
            case '-':
                System.out.println("Tanda Pengurangan");
                break;
                
            case '/':
                System.out.println("Tanda Pembagian");
                break;
                
            case '*':
                System.out.println("Tanda Perkalian");
                break;
                
            case '#':
                System.out.println("Tanda Pagar");
                break;
                
            case '@':
                System.out.println("Tanda Id");
                break;
                
            default :
                System.out.println("Sorry Salah");
            
        }
                
        
        
    }
    
}
