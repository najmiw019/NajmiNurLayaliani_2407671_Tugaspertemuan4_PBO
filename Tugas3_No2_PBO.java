package com.mycompany.tugas3_perulangan_pbo;

import java.util.Scanner;

public class Tugas3_No2_PBO {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int batasAwal, batasAkhir;
        int jumlahGanjil = 0;
        
        System.out.print ("Masukan bilangan batas awal: ");
        batasAwal = input.nextInt();
        
        System.out.print ("Masukan bilangan batas akhir: ");
        batasAkhir = input.nextInt();
        
        if (batasAwal > batasAkhir) {
            System.out.print ("Maaf , ada kesalahan di masukan bilangan");
        } else {
            for (int i = batasAwal; i <= batasAkhir; i++) {
                jumlahGanjil++;
            }
            System.out.print ("Banyaknya bilangan ganjil " + jumlahGanjil);
        }
        input.close();
    }
}
