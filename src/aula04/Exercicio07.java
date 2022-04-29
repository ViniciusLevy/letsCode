package aula04;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        final String[] G = {"a", "c", "d", "a", "b", "b", "a", "d", "a", "c"};

        Scanner entrada = new Scanner(System.in);
        String[][] respostaAlunos = new String[10][10];

        for (int i = 0; i < respostaAlunos.length; i++) {
            for (int j = 0; j < respostaAlunos[i].length; j++) {
                System.out.printf("Digite a resposta do aluno %d para a questão %d: ", (i + 1), (j + 1));
                respostaAlunos[i][j] = entrada.nextLine();
            }
        }

        System.out.println("Resposta Alunos");
        for(int i = 0; i < respostaAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for(int j = 0; j < respostaAlunos[i].length; j++) {
                System.out.print(respostaAlunos[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Acertos Alunos");
        double acertos;
        for(int i = 0; i < respostaAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            acertos = 0;
            for(int j = 0; j < respostaAlunos[i].length; j++) {
                if (respostaAlunos[i][j].equals(G[j])) {
                    acertos++;
                }
            }
            System.out.println(acertos);

            if (acertos >= 6) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }

        entrada.close();
    }
}
