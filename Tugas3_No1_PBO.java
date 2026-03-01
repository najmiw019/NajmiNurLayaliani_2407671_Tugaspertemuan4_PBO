package com.mycompany.tugas3_perulangan_pbo;

import java.util.Scanner;

public class Tugas3_No1_PBO {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n;

        System.out.print ("Masukan N : ");
        n = input.nextInt();
        if (n < 1){
            System.out.println ("Nilai N harus lebih dari 1");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        input.close();
    }
}