package M5_OutrosTopicos;

public class operacaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vect = s.split(" "); //recebe espaço como separador
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);


        //s.split recebe um separador e gera um vetor com as partes recortadas do string de acordo com o separador
    }
}
