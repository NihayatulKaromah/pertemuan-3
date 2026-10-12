
package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {

    public static void main(String[] args) {
    String jenis_pengiriman = "lokal";
    String tipe_barang = "dokumen";
    
    switch (jenis_pengiriman){
        case "lokal":
            switch (tipe_barang){
                case "dokumen":
                    System.out.println("biaya   :   10000");
                    break;
                case "barang":
                    System.out.println("biaya   :   20000");
                    break;
                default:
                    System.out.println("Tidak Ada Harganya");
                    break;
            }
         break;
        case "internasional":
            switch (tipe_barang){
                case "dokumen":
                    System.out.println("biaya   :   100000");
                    break;
                case "barang":
                    System.out.println("biaya   :   200000");
                    break;
                default:
                    System.out.println("Maaf Tidak Berharga");
            }
        default:
            System.out.println("Tidak Terdefinisi");
    }
    
     
    
    
    
    }
    
}
