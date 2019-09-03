package com.unama;

import java.util.Scanner;

public class LetraB_aula03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int produzidas, defeituosas;
        System.out.println("Informe o total de peças produzidas: ");
        produzidas = sc.nextInt();
        System.out.println("Informe o numero de peças defeituosas: ");
        defeituosas = sc.nextInt();
        if(defeituosas > produzidas * 10/100){
            System.out.println("A maquina precisa de manutençao.");
        } else {
            System.out.println("A maquina nao precisa de manutençao.");
        }








    }
}
