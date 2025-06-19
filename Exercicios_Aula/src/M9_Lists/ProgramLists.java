package M9_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //necessário usar wrapper
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        //inserindo novo elemento
        list.add(2, "Marco"); //add na posição 2

        //tamanho da lista
        System.out.println(list.size());

        for (String x : list){ //para casa elemento x pertencente a list
            System.out.println(x);
        }
        System.out.println("-------------------------------------");

        //remover elemento
        //list.remove("Ana"); //compara o valor com os contidos na lista
        //list.remove(1); //remove por posição

        //remover elementos que atendam a predicado
        list.removeIf(x -> x.charAt(0) == 'M'); //função lambda
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-------------------------------------");
        //encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando o elemento não existe a posição é -1

        System.out.println("-------------------------------------");
        //filtrar por condição (letra por ex)
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //nova lista gerada filtrando a condição
        //stream aceita operações com expressões lambda, porém não é compatível com list, por isso se usa collect
        for (String x : result){
            System.out.println(x);
        }

        //encontrar elemento na lista que atenda a predicado
        //1° elemento que começa com A
        System.out.println("-------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //findFirst retorna optional string, se o elemento não existir retorna nulo
        String nameTest = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(nameTest);

    }
}
