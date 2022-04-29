package aula04;


public class Teste {

    public static void main(String[] args) {

//        int temperaturasPorEstacao[][] = {{38, 28, 27, 30}, {35, 22, 21, 19}, {38, 28, 27, 29}};
//        String estados[] = {"Brasilia", "São Paulo", "Minas"};
//
//        for(int i = 0; i < temperaturasPorEstacao.length; i++) {
//            System.out.printf("ESTADO: %s\n", estados[i]);
//            for(int j = 0; j < temperaturasPorEstacao[i].length; j++) {
//                System.out.println(temperaturasPorEstacao[i][j]);
//            }
//            System.out.println("\n");
//        }

        int [][]matriz = new int[3][3];

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]=1;
                System.out.print(matriz[0][j]);
            }
            System.out.println(matriz[i][0]);
        }

    }
}
