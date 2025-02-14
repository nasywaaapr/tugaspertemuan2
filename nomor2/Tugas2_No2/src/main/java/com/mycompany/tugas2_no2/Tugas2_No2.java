/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2_no2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas2_No2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan jumlah uang : ");
        int uang = input.nextInt();
        
        System.out.println("Apakah pasangan Anda sedang ada kelas? (true/false): ");
        boolean adaKelasKuliah = input.nextBoolean();
        
        boolean beliMieGacoan = (uang > 10000) && (!adaKelasKuliah);
        
        if(beliMieGacoan){
            System.out.println("Beli Mie Gacoan!");
        } else {
            System.out.println("Tidak bisa membeli Mie Gacoan");
        }
        input.close();
    }
}
