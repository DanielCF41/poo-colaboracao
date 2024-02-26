/**
 * Exercicio2
 * Na disciplina de Programação Orientada a Objetos o aluno será avaliado
 * por meio de 2 projetos práticos (p) e pela participação nas aulas (a). A
 * nota para os projetos práticos é calculada por meio de uma média
 * ponderada, com os seguintes pesos W = {w1, w2} = {2, 3}. O Conceito
 * Final (CF) é calculado por meio de uma média ponderada, os projetos com
 * peso 0,9 e a participação nas aulas com peso 0,1. Sendo assim, o Conceito
 * Final (CF) se dará por meio da Equação 1:
 * 
 * formula
 * 
 * Desenvolva um aplicativo em Java que permita receber, como
 * argumentos de linha de comando, as notas dos 2 projetos práticos e da
 * participação na aula e depois imprima na tela o conceito final e a palavra
 * APROVADO, caso o CF ≥ 6 ou REPROVADO, caso contrário
 */

 import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        final double PESO_PROJETO = 0.9;
        final double PESO_PARTICIPACAO = 0.1;

        // usar via argumento de linha de comando

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota do projeto 1: ");
        int proj1 = teclado.nextInt();

        System.out.println("Nota do projeto 2: ");
        int proj2 = teclado.nextInt();

        System.out.println("Nota de participação: ");
        int participacao = teclado.nextInt();

        // pesos dos projetos
        int w1 = 2;
        int w2 = 3;

        double conceitoFinal = ((((proj1*w1)+(proj2*w2))/(w1+w2))*PESO_PROJETO + participacao*PESO_PARTICIPACAO);

        System.out.println("O conceito final é: " + conceitoFinal);
    }
}
