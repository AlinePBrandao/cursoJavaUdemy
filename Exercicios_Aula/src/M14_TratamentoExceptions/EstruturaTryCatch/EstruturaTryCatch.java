package M14_TratamentoExceptions.EstruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1(){
        System.out.println("***METHOD1  STARTED***");
        method2();
        System.out.println("***METHOD1  FINISHED***");
    }
    public static void method2(){

        System.out.println("***METHOD2  STARTED***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            // NOTE: vai ler vários dados separados por um espaço em branco (" "), cada dado será um elemento do vect
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
            // NOTE: imprime o rastreamento do stack (lista com tipo da exceção e a sequência de chamadas)
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Imput error");
        }
        sc.close();
        System.out.println("***METHOD2  FINISHED***");
    }
}
