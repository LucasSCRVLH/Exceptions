package com.poo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio2 {
     
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 -Correr");
            System.out.println("2 - Andar");
            System.out.println("3 - Ficar parado");
            System.out.println("4 - Morrer");

            try {
                
                System.out.print("Digite o número da opção desejada: ");
                opcao = sc.nextInt();

              
                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu correr.");
                        break;
                    case 2:
                        System.out.println("Você escolheu andar.");
                        break;
                    case 3:
                        System.out.println("Você escolheu ficar parado.");
                        break;
                    case 4:
                        System.out.println("Voce escolheu morrer.");
                        break;
                    default:
                        System.out.println("Opção inválida! Digite um número de 0 a 4.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: por favor, digite um número inteiro válido.");
                sc.nextLine(); 
                opcao = 5; 
            }

        } while (opcao>4);

        sc.close();
    }

}
