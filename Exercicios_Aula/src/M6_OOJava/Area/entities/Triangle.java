package M6_OOJava.Area.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){ //Não recebe parametros pois os dados necessários estão contidos na classe
        double p = (a + b + c) / 2.0; //atributos sa classe, aqui não temos objetos
        double result = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return result;

        /*ou  simplesmente
        return Math.sqrt(p * (p-a) * (p-b) * (p-c)); */
    }
}
