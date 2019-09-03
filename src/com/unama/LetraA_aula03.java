package com.unama;

import java.util.Scanner;

public class LetraA_aula03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total_copias;
        double total_pago;
        System.out.println("Informe o numero de copias: ");
        total_copias = sc.nextInt();
        if(total_copias<=100){
        total_pago = total_copias * 0.25;
        } else {
            total_pago = total_copias * 0.20;
        }
        System.out.println("O valor a ser pago é: R$ " + total_pago);






    }
}
