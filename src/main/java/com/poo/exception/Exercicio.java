package com.poo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {

    static void ex1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();
        try {
            double resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        sc.close();
    }
    
 }



    
    
        


   




    


 
   



