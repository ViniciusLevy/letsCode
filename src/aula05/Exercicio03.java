package aula05;

import java.util.Scanner;

/*
3. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
* “Telefonou para a vítima? “
* “Esteve no local do crime?”
* “Mora perto da vítima? “
* “Mora perto da vítima? “
* “Já trabalhou com a vítima? “
* Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Responda 1 p/ sim e 0 p/ não");

        System.out.print("Telefonou para a vítima?");
        int pergunta1 = scanner.nextInt();

        System.out.print("Esteve no local do crime? ");
        int pergunta2 = scanner.nextInt();

        System.out.print("Mora perto da vítima? ");
        int pergunta3 = scanner.nextInt();

        System.out.print("Devia para a vítima? ");
        int pergunta4 = scanner.nextInt();

        System.out.print("Já trabalhou com a vítima? ");
        int pergunta5 = scanner.nextInt();

        int somaPerguntas = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5;

        if (somaPerguntas == 2) {
            System.out.println("Entrevistado classificado como SUSPEITO");
        } else if (somaPerguntas >= 3 && somaPerguntas <= 4) {
            System.out.println("Entrevistado classificado como CÚMPLICE");
        } else if (somaPerguntas > 4) {
            System.out.println("Entrevistado classificado como CULPADO");
        } else {
            System.out.println("Entrevistado classificado como INOCENTE");
        }

        scanner.close();
    }
}
