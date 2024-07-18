package com.poo.exception;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio3 {


static void lista() { 
Scanner sc = new Scanner(System.in);
boolean opcao = true;
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Lucas");
nomes.add("Enzo");
nomes.add("Eloisa");

do {


    System.out.println("Lista de Nomes:");
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(i + " - " + nomes.get(i));
}


int indexEscolhido = -1;

try {
  
    System.out.print("Escolha o índice do nome desejado: ");
    indexEscolhido = sc.nextInt();

    if (indexEscolhido >= 0 && indexEscolhido < nomes.size()) {
        System.out.println("Nome escolhido: " + nomes.get(indexEscolhido));
        opcao = false;
    } else {
        System.out.println("Erro: Índice inválido. Escolha um índice válido.");
       
    }
} catch (InputMismatchException e) {
    System.out.println("Erro: por favor, digite um número inteiro válido.");
   
} finally {
    sc.nextLine(); 
   
}
} while (opcao);








}
}
