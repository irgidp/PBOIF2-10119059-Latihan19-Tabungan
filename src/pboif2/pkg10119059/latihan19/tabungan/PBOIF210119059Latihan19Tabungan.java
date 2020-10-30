/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan saldo tabungan setelah ditambah bunga
 */
package pboif2.pkg10119059.latihan19.tabungan;

public class PBOIF210119059Latihan19Tabungan {
    
    public static void main(String[] args) {
         double saldoAwal,bunga,total,totalBunga;
        int lama,i;
        
        saldoAwal = 2500000;
        bunga = 0.15;
        lama = 6;
        i=1;
        
        do{
            totalBunga = saldoAwal * bunga;
            total = totalBunga + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n", +total);
            saldoAwal += totalBunga;
            i++ ;
        } while (i <= lama);
    }
    
}
