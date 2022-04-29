package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valor da linha %d coluna %d da Matriz: ", (i + 1), (j +1));
                matriz[i][j] = scanner.nextDouble();
            }
        }


        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
