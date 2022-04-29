package aula03;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            if(numero > 0) {
                System.out.print("O número é positivo! \n");
            } else {
                System.out.print("O número é negativo! \n");
            }
        }

        entrada.close();
    }
}
