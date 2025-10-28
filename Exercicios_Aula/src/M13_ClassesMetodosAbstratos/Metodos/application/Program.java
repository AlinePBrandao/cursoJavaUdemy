package M13_ClassesMetodosAbstratos.Metodos.application;

import M13_ClassesMetodosAbstratos.Metodos.entities.Shape;
import M13_ClassesMetodosAbstratos.Metodos.entities.Rectangle;
import M13_ClassesMetodosAbstratos.Metodos.entities.Circle;
import M13_ClassesMetodosAbstratos.Metodos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        //NOTE: usar tipo generico na coleçao para polimorfismo, list declarada do tipo da superclasse
        //NOTE: dessa forma a list aceita dados de todas as subclasses (Rectangle e Circle)

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.print("Shape #" + i + " data: ");

            char ch;
            while (true){
                System.out.print("Rectangle or Circle (r/c)? ");
                ch = sc.next().charAt(0);

                if (ch == 'r' || ch == 'c'){
                    break;
                }
                else {
                    System.out.println("Invalid option. Please enter 'r' for Rectangle or 'c' for Circle.");
                }
            }

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                // NOTE: fazer o import manual do Rectangle facilita na instanciação do rectangle correto
                list.add(new Rectangle(color, width, height));
            }
            else if (ch == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                // NOTE: fazer o import manual do Circle facilita na instanciação do circle correto
                list.add(new Circle(color, radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list ){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
