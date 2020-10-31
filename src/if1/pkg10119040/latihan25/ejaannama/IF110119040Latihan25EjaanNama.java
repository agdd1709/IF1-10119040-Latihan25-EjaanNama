/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program ejaan nama yang di inputkan
 */
public class IF110119040Latihan25EjaanNama {

    public static void ejaan(String nama, int jumlahKarakter){
        for (int i = 0; i<jumlahKarakter; i++) {
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-" + no + " : " + eja);
        }
    }
    
    public static void main(String[] args) {
        String nama;
        int jumlahKarakter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        nama = input.next();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk " + "'" + nama + "'" + " adalah :");
        ejaan(nama,jumlahKarakter);
    }
    
}
