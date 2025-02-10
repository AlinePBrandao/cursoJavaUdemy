package M2;

public class funcaoMatematica {
    public static void main(String[] args) {
        double x = 3.0; double y = 4.0; double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); B = Math.sqrt(y); C = Math.sqrt(25.0);
        //Raiz quadrada

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.printf("Raiz quadrada de 25 = " + C + "%n");

        A = Math.pow(x, y); B = Math.pow(x, 2.0); C = Math.pow(5.0, 2.0);
        //Potência

        System.out.printf("%n" + x + " elevado a " + y + " = " + A);
        System.out.println( x + " elevado ao quadrado " + y + " = " + B);
        System.out.printf("5 elevado ao quadrado = " + C + "%n");

        A = Math.abs(y); B = Math.abs(z);
        //Valor absoluto

        System.out.printf("%n Valor absoluto de " + y + " = " + A + "%n");
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
