package M14_TratamentoExceptions.estruturaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            // NOTE: vai ler vários dados separados por um espaço em branco (" "), cada dado será um elemento do vect
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }
         catch (InputMismatchException e){
                    System.out.println("Imput error");
        }

        System.out.println("End of program");

        sc.close();
    }
}
