package aula04;

import java.util.Scanner;

/**
* 17. A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
 *  Faça um algoritmos para coletar dados sobre o salário e número de
 *  filhos de cada habitante e após as leituras, escrever:
 *  1. Média de salário da população
 *  2. Média do número de filhos
 *  3. Maior salário dos habitantes
 *  4. Percentual de pessoas com salário menor que R$ 150,00
 *  Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.
 **/

public class Excercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de habitantes: ");
        int quantidade = scanner.nextInt();

        boolean isHabitanteValido = true;



        while(isHabitanteValido) {
            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.println("Digite o número de filhos: ");
            int numeroFilhos = scanner.nextInt();

            isHabitanteValido = salario >= 0;

            scanner.close();
        }


    }


}
