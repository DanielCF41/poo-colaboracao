/**
 * Exercicio1:
 * Faça um programa que leia do teclado seu nome, o ano que você nasceu,
 * o ano atual e imprima na tela seu nome e sua idade.
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        int nascimento = teclado.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();

        System.out.println(nome + " possui " + (anoAtual - nascimento) + " anos");
    }
}
