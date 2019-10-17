/*
   
 */

package if01.pbo1.pkg10118009.latihan35.programtunjangan;



/**
 *
 * @author Fatahillah Seno
 */

public class karyaWan {
    public double tunjangan;
    public double total = 0;
    
    public double hitungTunjangan(double gaji){
        return gaji * 0.35;
    }
    public void hitungGaji(double perGaji, String status) {
         if (status.equalsIgnoreCase("Menikah") || status.equalsIgnoreCase("menikah")){
            tunjangan = hitungTunjangan(perGaji);
            total = perGaji + tunjangan; 
        }else{
            tunjangan = 0;
            total = perGaji + tunjangan;
        }
    }
}
    
    
 
