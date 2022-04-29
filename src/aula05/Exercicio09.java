package aula05;

/*
9. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
 */

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        double mediaArit = 0;
        double mediaPond = 0;
        double notas = 0;
        int peso = 0;
        double auxNota = 0;
        int auxPeso = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite MA para selecionar (Média Aritimética) ou MP para selecionar (Média Ponderada): ");
        String escolhaMedia  = entrada.next();

        if (escolhaMedia.equals("MA")) {

            for (int i = 0; i < 2; i++){
            System.out.printf("Digite %dº nota: ", (i + 1));
            notas += entrada.nextDouble();
            }
            mediaArit = notas /2;
            System.out.printf("MÉDIA ARITIMÉTICA = %.2f",mediaArit);

        } else if ( escolhaMedia.equals("MP")) {

            for (int i = 0; i < 3; i++){
                System.out.printf("Digite %dº nota: ", (i + 1));
                notas += entrada.nextDouble();
                System.out.printf("Digite o peso da %dº nota: ", (i + 1));
                peso += entrada.nextDouble();
                double notaComPeso = notas * peso;
                auxNota += notaComPeso;
                auxPeso += peso;
                notas = 0;
                peso = 0;
            }
            mediaPond = auxNota / auxPeso;
        System.out.printf("MÉDIA PONDERADA = %.2f",mediaPond);
        } else {
            System.out.println("Entrada Inválida, recomece o programa");
        }
        entrada.close();
    }
}
