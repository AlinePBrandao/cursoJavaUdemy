package M9_Lists.Matriz;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //arranjo bidiecional - arranjo dado pela quantidade de colchetes
        //[n-linhas][n-colunas]

        for(int i=0; i< mat.length; i++){ //for para percorrer as linhas
            for (int j = 0; j <mat[i].length; j++){ //for para percorrer as colunas
                mat[i][j] = sc.nextInt(); //inserir valor correspondente a cada espaço
            }
        }

        System.out.println("Main diagonal: ");
        for(int i=0; i<mat.length; i++){
            System.out.print(mat[i][i] + " "); //elemento na mesma posição (linha 0 coluna 0, 1 e 1, 2 e 2)
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++){
            for (int j = 0; j <mat[i].length; j++){
                if (mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative numbers= " + count);
        sc.close();
    }
}
