/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2_no1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas2_No1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan bilangan a : ");
        int a = input.nextInt();
        System.out.print("Masukan bilangan b : ");
        int b = input.nextInt();
        System.out.print("Masukan bilangan c : ");
        int c = input.nextInt();
        
        //Memastikan semua bilangan yang di input itu bilangan negatif
        if (a >= 0 || b >= 0 || c >= 0){
            System.out.println("Error! Program hanya menerima bilangan negatif");
        } else {
            int penjumlahan = a + b + c;
            int pengurangan = a - b - c;
            int perkalian = a * b * c;
            
            //Memastikan agar tidak terjadi pembagian dengan nol
            if (b != 0 && c !=0){
                double pembagian = (double) a/b/c;
                System.out.println("Hasil pembagian : " + pembagian);
            } else {
                System.out.println("Tidak dapat melakukan pembagian karena ada angka 0");
            }
            
            System.out.println("Hasil penjumlahan : " + penjumlahan);
            System.out.println("Hasil pengurangan : " + pengurangan);
            System.out.println("Hasil perkalian : " + perkalian);
        }
        
        input.close();
    }
}
