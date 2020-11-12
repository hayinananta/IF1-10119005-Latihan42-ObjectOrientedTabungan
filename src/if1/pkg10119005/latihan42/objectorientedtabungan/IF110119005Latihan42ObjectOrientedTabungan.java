/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan42.objectorientedtabungan;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini untuk menunjukkan Pnearikan Uang dengan
 *                     berbasis Objek.
 */
public class IF110119005Latihan42ObjectOrientedTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        Tabungan tabungan = new Tabungan();
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int saldo = scanner.nextInt();
        tabungan.Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));

    }
    
}
