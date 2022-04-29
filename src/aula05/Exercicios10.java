package aula05;

/*
10. Cada espectador de um cinema respondeu a um questionário no qual
constava sua idade e a sua opinião em relação ao filme:
3 - ótimo,
2 - bom,
1 - regular
Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
* A média das idades das pessoas que responderam ótimo;
* A quantidade de pessoas que respondeu regular;
* A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
 */

import java.util.Scanner;

public class Exercicios10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//        int[][] pesquisaCinema = new int[2][5];
//        int otimoIdade = 0;
//        int regular = 0;
//        int bom = 0;
//        int contador = 0;
//
//        for (int i = 0; i < pesquisaCinema.length; i++) {
//            for (int j = 0; j < pesquisaCinema[i].length; j++) {
//
//                if (pesquisaCinema[0][j] == 0) {
//                    System.out.print("Insira a sua idade : ");
//                    pesquisaCinema[0][j] = entrada.nextInt();
//                }
//
//                if (pesquisaCinema[1][j] == 0) {
//                    System.out.print("Insira uma nota \n3 - ótimo \n2 - bom \n1 - regular: ");
//                    pesquisaCinema[1][j] = entrada.nextInt();
//                }
//            }
//        }
//
//        for (int i = 0; i < pesquisaCinema.length; i++) {
//            for (int j = 0; j < pesquisaCinema[i].length; j++) {
//                 System.out.print(pesquisaCinema[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < pesquisaCinema.length; i++) {
//            for (int j = 0; j < pesquisaCinema[i].length; j++) {
//                if (pesquisaCinema[1][j] == 3) {
//                    otimoIdade += pesquisaCinema[0][j];
//                    contador++;
//
//                }
//                if (pesquisaCinema[1][j] == 1) {
//                    regular += pesquisaCinema[1][j];
//                }
//                if (pesquisaCinema[1][j] == 2) {
//                    bom += pesquisaCinema[1][j];
//                }
//            }
//        }
//
//        System.out.println(contador);
//        System.out.println(otimoIdade);
//        System.out.println(regular);
//        System.out.println((bom / 5) * 100);

        int idade, opniao;
        int opcao1 = 0, opcao2 = 0, opcao3 = 0, qtdeRegular = 0, cont3 = 0;
        double mediaOtimo, percBom;

        System.out.println("**Pesquisa de opinião**");
        System.out.println("1 - Regular");
        System.out.println("2 - Bom");
        System.out.println("3 - Ótimo");

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite a sua idade: ");
            idade = entrada.nextInt();

            System.out.print("Digite a sua opinião: ");
            opniao = entrada.nextInt();

            if (opniao == 1) {
                qtdeRegular++;
            } else if (opniao == 2) {
                opcao2++;
            } else if (opniao == 3) {
                opcao3 = idade + opcao3;
                cont3++;
            }
        }

        mediaOtimo = opcao3 / cont3;

        percBom = (opcao2 / 5) * 100;

        System.out.printf("A media das idades das pessoas que responderam ótimo....: %.1f\n", mediaOtimo);
        System.out.printf("A quantidade de pessoas que responde regular....: %d\n", qtdeRegular);
        System.out.printf("A percentagem de pessoas que respondeu BOM entre todos os espectadores analisados....: %.1f\n", percBom);


        entrada.close();

    }


}
