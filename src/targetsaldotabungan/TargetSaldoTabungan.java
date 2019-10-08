/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo=3500000, i = 1, target = 6000000;
        double bunga;    
        do {
            bunga = saldo*8/100 ;
            saldo = (int) (saldo + bunga);
            System.out.printf("Saldo di bulan ke-"+ i +" Rp.%,10d%n", saldo);
            i++;
        } while (saldo <= target);
    }
    
}
