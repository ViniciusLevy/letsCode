package aula05;

/*
5. Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas pessoas quer adicionar: ");
        int tamanho = entrada.nextInt();

        int [][] agenda = new int[tamanho][3];

        System.out.println("Digite 1 p/ Adicionar e 2 p/ Excluir pessoa: ");
        int resposta = entrada.nextInt();


        if (resposta == 1) {
            for (int i = 0; i < agenda.length; i++) {
                for (int j = 0; j < agenda[i].length; j++) {
                    System.out.print("Digite o código da pessoa: ");
                    agenda[i][j] = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Digite o telefone da pessoa: ");
                    agenda[i][j] = entrada.nextInt();

                    System.out.print("Digite a idade da pessoa: ");
                    agenda[i][j] = entrada.nextInt();

                    System.out.println();
                }


            }
        }
    }
}

