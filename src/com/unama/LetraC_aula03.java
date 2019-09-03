package com.unama;

import java.util.Scanner;

public class LetraC_aula03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Informe a idade do nadador: ");
        idade = sc.nextInt();
        if(idade <= 10){
            System.out.println("O nadador é infantil.");
        } else if
        (idade > 10 && idade <=17) {
        System.out.println("O nadador é juvenil.");
    } else {
                System.out.println("O nadador é senior.");
    }






    }
}
