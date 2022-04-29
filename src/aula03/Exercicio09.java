package aula03;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Insira a idade de ordem " + (i + 1) + ": ");
            idades[i] = entrada.nextInt();
        }

        int maiorDezoito = 0;
        for(int i = 0; i < idades.length; i++){
            if(idades[i] >= 18){
                maiorDezoito++;
            }
        }

        System.out.printf("Entre as idades inseridas, apenas %d são maiores de 18 anos.", maiorDezoito);

        entrada.close();
    }
}
