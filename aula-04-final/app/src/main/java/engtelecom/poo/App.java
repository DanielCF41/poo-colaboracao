/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // ./gradlew run --args "blabla bla"
        /*if(args.length >0){
            System.out.println("Olá " + args[0] + args[1]);
        }*/

        // java App < arq.txt
        Scanner linha = new Scanner(System.in);

        int i = 1;
        while(linha.hasNext()){
            String aux = linha.nextLine();
            System.out.print(i + " ");
            System.out.println(aux.toUpperCase());
            i++;
        }
    }
}
