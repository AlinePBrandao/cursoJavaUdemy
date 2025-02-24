package M5_OutrosTopicos;

import java.util.Scanner;

public class funcoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        String s01 = original.toLowerCase(); //minusculo
        String s02 = original.toUpperCase(); //maiusculo
        String s03 = original.trim(); //remove espaços
        String s04 = original.substring(2); //remover início, pega da posição informada em diante
        String s05 = original.substring(2, 9); //remover início e fim até o ultimo carater informado
        String s06 = original.replace("a", "x"); //substituir caracter
        String s07 = original.replace("abc", "xy"); //substituir substring
        int i = original.indexOf("bc"); //busca a 1° posição da ocorrencia
        int j = original.lastIndexOf("bc");//busca a ultima posição da ocorrencia

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("indexOf 'bc': -" + i);
        System.out.println("lastIndexOf 'bc': -" + j);

    }
}
