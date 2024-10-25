/*
 * Construa um algoritmo para ler um número N informado pelo usuário, ao final deverá ser calculado a média,
   soma e a quantidade dos valores digitados.
 */

package com.mycompany.pergunta_6;

import java.util.Scanner;

public class PERGUNTA_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double media;
        double resultado;
        double soma;
        
        System.out.println("Digite um numero: ");
        double num = scanner.nextInt();
        
        media = num / 1;
        soma = media + num;
        resultado = media - media +1;
        
        System.out.println("A medida foi " + media + ",a soma foi de " + soma + "e a quantidade digitada e " + resultado);
        
        
        
    }
}
