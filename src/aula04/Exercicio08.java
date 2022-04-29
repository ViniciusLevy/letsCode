package aula04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] conjunto = new int[2][2];

        for(int i = 0; i < conjunto.length; i++) {
            for (int j = 0; j < conjunto.length; j++){
                conjunto[i][j] = random.nextInt(100);
                System.out.println(conjunto[i][j]);

            }
        }


    }
}
