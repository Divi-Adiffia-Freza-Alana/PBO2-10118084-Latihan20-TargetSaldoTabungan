/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan20.targetsaldo.tabungan;

/**
 *
 * @author Freza
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menghitung Target Saldo tabungan
 */
public class PBO210118084Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal,bunga,saldoTarget,i;
        saldoAwal = 3500000;
        bunga = 0.08;
        saldoTarget = 6000000;
        i=1;
        while(saldoAwal<=saldoTarget){
        saldoAwal = saldoAwal * bunga + saldoAwal;     
        System.out.println("Saldo di bulan ke-" + i + " Rp."+ saldoAwal);
        i++;
        }
    }
} 

