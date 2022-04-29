package aula01;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        String nome = entrada.next();

        System.out.print("Digite uma primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite uma segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite uma terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Olá %s, as notas inseridas são %.2f, %.2f e %.2f, sua média é: %.2f. \n",
                nome, nota1, nota2, nota3, media );

        if(media >= 7) {
            System.out.println("PARABÉS, VOCÊ ESTÁ APROVADO(A)!!!");
        } else if (media < 7 && media >= 4) {
            System.out.println("RECUPERAÇÃO!!!");
        } else {
            System.out.println("ALUNO REPROVADO(A)!!!");
        }

        entrada.close();
    }
}
