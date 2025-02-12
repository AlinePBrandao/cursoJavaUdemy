package M3_EstruturasCondicionais;

public class expressaoCondTernaria {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
        //(condição) ? se sim : se não

        System.out.println("Total a pagar com desconto= R$ " + desconto);
    }
}
