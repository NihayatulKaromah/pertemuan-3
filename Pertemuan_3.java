
package pertemuan_3;
import java.util.Scanner;
public class Pertemuan_3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        double p,l,L;
        
        System.out.println("Perhitungan Persegi Panjang");
        System.out.print("Masukkan Nilai Panjang  : ");
        p = inp.nextDouble();
        System.out.print("Masukkan Nilai Lebar    : ");
        l = inp.nextDouble();
        System.out.println("Menghitung Luas..........");
        
        if (p!=0 && l!=0){
            L= p*l;
            System.out.println("Menampilkan Luas");
            System.out.println("Luas Persegi Panjang    :   "+ String.format("%.2f",L));
        }
        else if (p==0){
            System.out.println("Gagal Menghitung");
            System.out.println("Masukkan Nilai Panjang yang Benar");
        }
        else if (l==0){
            System.out.println("Gagal Menghitung");
            System.out.println("Masukkan Nilai Lebar yang Benar");
        }
        else{
            System.out.println("Gagal Menghitung");
            System.out.println("Masukkan Nilai Panjang dan Lebar yang Benar");
            
        }
        
    }
    
}
