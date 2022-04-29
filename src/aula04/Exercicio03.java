package aula04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da linha %d coluna %d da Matriz: ", (i + 1), (j +1));
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        double maior = Double.MIN_VALUE;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.printf("Maior valor da Matriz é %.2f", maior);

        scanner.close();
    }
}
