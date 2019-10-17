
import if01.pbo1.pkg10118009.latihan35.programtunjangan.karyaWan;
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Program tunjangan
 */

public class IF01PBO110118009Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static double gajiPokok;
    public static String status;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        karyaWan kyw = new karyaWan();
         
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Gaji Pokok/Bulan = Rp ");
        gajiPokok = masukan.nextDouble();
        System.out.print("Status Anda (Menikah/Belum) = ");
        status = masukan.next();
        
        
        kyw.hitungGaji(gajiPokok, status);
        System.out.println("======= Hasil Gaji Anda =======");
        System.out.println("Gaji Pokok\t = Rp "+gajiPokok);
        System.out.println("Tunjangan\t = Rp "+kyw.tunjangan);
        System.out.println("Total\t\t = Rp "+kyw.total);
        System.out.println("Developed by : Tassyakur Pasya");
            
    }

}
