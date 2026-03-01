//Bilangan Faktorial
package com.mycompany.tugas3_perulangan_pbo;

import java.util.Scanner;

public class Tugas3_No3_PBO {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int hasil = 1;
        
        System.out.print ("Masukan nilai n: ");
        int n = input.nextInt();
        
        System.out.print (n + "! = ");
        
        if (n == 0 || n == 1) {
            System.out.print ("1");
        } else {
            for (int i = n; i >= 1; i--) {
                hasil *= i;
                System.out.print(i);
                
                if (i > 1) {
                    System.out.print (" * ");
                }
            }
            System.out.print (" = " + hasil);
        }
    }
}
