

package kirakomisyen;
import java.util.Scanner;
public class Kirakomisyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlah_gaji;
        double komisyen;
        int bil;
        
        System.out.println("Masukkan bilangan kereta=");
        bil =input.nextInt();
        if (bil > 10){
        komisyen = 10000;
        } else if (bil >=5 & bil <= 9){
        komisyen = 6000;
        } else if (bil >= 1 & bil <= 4){
        komisyen = 3000;
        }else{
        komisyen = 0;
        }
        
        
        jumlah_gaji = komisyen + 1800;
        
        System.out.println("Jumlah kereta dijual: " + bil);
        System.out.println("Jumlah komisyen= RM " + komisyen);
        System.out.println("Jumlah gaji= RM" + jumlah_gaji);
    }
    
}
