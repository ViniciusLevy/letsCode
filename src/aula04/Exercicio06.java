package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] gabarito = {1, 3, 2, 3, 1, 2, 2, 3, 1, 1, 2, 3, 1};
        int[] resposta = new int[13];
        int pontos = 0;

        for(int i = 0; i < gabarito.length; i++){
            System.out.printf("Digite o numero %d da sua aposta: ", (i +1));
            resposta[i] = scanner.nextInt();
        }
        System.out.printf("Sua aposta foi: %s\n", Arrays.toString(resposta));

        for(int i = 0; i < gabarito.length; i++) {
            if (resposta[i] == gabarito[i]) {
                pontos++;
            }
        }
        if(pontos == 13) {
            System.out.println("13 Acertos, Parabéns você ganhou!!!");
        } else if(pontos < 13) {
        System.out.printf("%d acertos, não foi desta vez!", pontos);
    }
        scanner.close();

    }
}
