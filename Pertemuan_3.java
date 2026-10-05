
package pertemuan_3;
import java.util.Scanner;
public class Pertemuan_3 {

    public static void main(String[] args) {
       
        Scanner inp = new Scanner (System.in);
        String index;
        System.out.println("=============================================");
        System.out.println("                  HITUNG BMI               ");
        System.out.println("=============================================");
        System.out.print("Masukkan Nama Lengkap   :   ");
        String nama = inp.nextLine();
        System.out.print("Masukkan Berat (kg)     :   ");
        Double berat = inp.nextDouble();
        System.out.print("Masukkan Tinggi (cm)    :   ");
        Double tinggi = inp.nextDouble();
        System.out.println("============================================");
        System.out.println("                    HASIL                   ");
        System.out.println("============================================");
        
        String a="Nihayatul Karomah";
        double b=38;
        double c=142;
        double d=1.42;
        double bmi=b/(d*d);
        double ideal=25*(d*d);
        
        if (bmi<18.5){
            index = "underweight";
        }
        else if (bmi<=18.5 && bmi<25){
            index = "normal";
        }
        else if (bmi<=25 && bmi<30){
            index = "overweight";
        }
        else if (bmi<=30 && bmi<40){
            index = "obese";
        }
        else if (bmi>=40){
            index = "over obese";
        }
        
        System.out.println("Nama Lengkap  :   " +a);
        System.out.println("Berat Badan   :   " +b +" kg");
        System.out.println("Tinggi Badan  :   " +c +" cm");
        System.out.println("BMI           :   " +bmi);
        System.out.println("Berat Ideal   :   " +ideal +" kg");
        System.out.println("Selisih       :   " +(b-ideal) +" kg");
        System.out.println("============================================");
        
                
       
        
        
    }
    
}
