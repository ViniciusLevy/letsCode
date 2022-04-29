package aula04;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];


        int soma = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor da linha %d coluna %d da Matriz: ", (i + 1), (j +1));
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Escolha uma linha: ");
        int indicador = (scanner.nextInt() - 1);


        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                soma = matriz[indicador][0] + matriz[indicador][1];
            }
        }
        System.out.printf("A soma da linha %d é %d", (indicador +1), soma);
    }

}
