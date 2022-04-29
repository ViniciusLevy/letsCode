package aula03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        int erros = 3, tentativa = 0, palpite = 0;

        Random random = new Random();
        int numero = random.nextInt(10);

        Scanner entrada = new Scanner(System.in);

        System.out.println(numero);


        while(palpite != numero && erros > 0){

            System.out.print("Adivinhe o número: ");
            palpite = entrada.nextInt();

            tentativa++;


            if(numero < palpite){
                erros--;
                System.out.println("O número é menor");
            } else if(numero > palpite){
                erros--;
                System.out.println("O número é maior");
            }

            if(palpite == numero){
                System.out.println("Parabéns! Você acertou o número em " + tentativa + " tentativas. Número sorteado: " + numero);
            } else if (erros == 0) {
                System.out.println("Você perdeu! O número sorteado foi o " + numero);
            }

        }
        entrada.close();
    }
}
