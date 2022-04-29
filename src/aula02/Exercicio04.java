package aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de praias que serão inseridas: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        String[] praias = new String[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite o nome da praia " + (i + 1) + ": ");
            praias[i] = entrada.nextLine();
        }

        double[] distanciaPraias = new double[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite a distância da praia " + (i + 1) + ": ");
            distanciaPraias[i] = entrada.nextDouble();
        }

        // NOME DA PRAIA MAIS DISTANTE
        double maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for(int j = 0; j < distanciaPraias.length; j++) {
            if(distanciaPraias[j] > maior) {
                maior = distanciaPraias[j];
                indiceMaior = j;

            }
        }
        System.out.printf("\nA maior distância  é a de %.2f km da praia %s \n", maior, praias[indiceMaior]);

        // PRAIAS > DE 10KM E PRAIAS < DE 15KM
        int maiorDezMenorQuinze = 0;
        for(int i = 0; i < distanciaPraias.length; i++) {
            if(distanciaPraias[i] >= 10 && distanciaPraias[i] <= 15) {
                maiorDezMenorQuinze++;
            }
        }
        System.out.printf("A quantidade de praias que estão a mais de 10km e menos de 15km do Hotel são: %d \n",
                maiorDezMenorQuinze);

        // MÉDIA DE DISTÂNCIA
        double total = 0;
        for(double distancia: distanciaPraias) {
            total += distancia;
        }

        double media = total / distanciaPraias.length;

        System.out.printf("A distância média das praias é: %.2f km\n", media);

        System.out.print("A lista das praias: " + Arrays.toString(praias) + "\n");
        System.out.print("A distância das praias em km: " + Arrays.toString(distanciaPraias));

        entrada.close();


    }
}
