package M8_ArrayAndLists.Exercises.Height.application;

import M8_ArrayAndLists.Exercises.Height.entities.Person;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number of parsons are you going to enter? ");
        int n = sc.nextInt();
        sc.nextLine();
        Person[] vect = new Person[n];

        for (int i=0; i<vect.length; i++){
            System.out.println((i + 1) + " Person's details: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Person(name, age, height);
        }

        double sumHeight = 0.0;
        double under16 = 0;
        ArrayList<String> under16Names = new ArrayList<>();

        for (int i=0; i<vect.length; i++){
            sumHeight += vect[i].getHeight();
            if (vect[i].getAge() < 16){
                under16++;
                under16Names.add(vect[i].getName());
            }
        }

        double mediaHeight = sumHeight / n;
        double percentUnder = ((double) under16 / n) * 100.0;

        System.out.printf("Media height: %.2f %n", mediaHeight);
        System.out.printf("People under 16 years old: %.1f%%%n", percentUnder);

        for (String name : under16Names){ //para cada name do tipo String contido na lista under16Names, faça
            System.out.println(name); //imprime name
        }
        /* OU
        for (int i = 0; i < under16Names.size(); i++) {
            System.out.println(under16Names.get(i));
        } */
        sc.close();
    }
}
