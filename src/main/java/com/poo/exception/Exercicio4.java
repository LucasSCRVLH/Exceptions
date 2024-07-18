package com.poo.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 extends Exception {

void ex4() { 

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


int nome = -1;

try {
    System.out.print("Escolha o índice do nome desejado: ");
    nome = sc.nextInt();
    if (nome >= 0 && nome < nomes.size()) {
        System.out.println("Nome escolhido: " + nomes.get(nome));   
        opcao = false;
    
    }  
} 
catch (InputMismatchException e) {
    System.out.println("Erro: por favor, digite um número inteiro válido.");
    System.out.println( "Parte do Erro:");
    e.printStackTrace();
} finally {
    
    sc.nextLine(); 
   
}
} while (opcao);
}
public class Personalizada extends Exception{
    public Personalizada(String mensagem){
        super(mensagem);
    }
 }
 }