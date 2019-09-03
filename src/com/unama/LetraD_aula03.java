package com.unama;

import java.util.Scanner;

public class LetraD_aula03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double numeroA , numeroB , numeroC;
        System.out.println("Informe o primeiro numero: ");
        numeroA = sc.nextDouble();
        System.out.println("Informe o segundo numero: ");
        numeroB = sc.nextDouble();
        System.out.println("Informe o terceiro numero: ");
        numeroC = sc.nextDouble();
        if(numeroA - numeroB < numeroC < numeroA < numeroB) {
            System.out.println("As 3 medidas formam um triangulo.");
        }







    }
}
