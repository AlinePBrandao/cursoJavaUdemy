package M7_OO2.Estoque.entities;

public class Products {
    String name; //vai ser usado na classe Order
    private double price;
    private int quantity;
    //ENCAPSULAR ATRIBUTOS

    //CONSTRUCTOR
    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } //construtor não recebe tipo de retorno - int, double- e executa na instanciação do objeto

    //SOBRECARGA
    public Products(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0; //opcional - java inicia números de objetos e arrays com valor 0;
    } //quantity não precisa de this porque não existe mais ambiguidade (quem é parâmtro e atributo)

    public void setName(String name){
        this.name = name;
    } //método que permite alterar o nome na Program

    public String getName(){
        return name;
    } //método para permitir update do nome

    public double getPrice() {
        return price;
    } //método para permitir update do price

    public void setPrice(double price){
        this.price = price; //atribui ao atributo price do objeto o valor passado como argumento no método
    }

    public int getQuantity(){
        return quantity;
    } //retorna quantidade. Quantidade só altera com entra ou saída do estoque, por isso não tem set

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){ //entrada estoque
        this.quantity += quantity; //this acessa o atributo da classe e não o parametro, referencia o atributo da classe
    }
    public void removeProducts(int quantity){ //saída estoque
        this.quantity -= quantity;
    }

    public String toString(){ //sobreposição da operação toString padrão, pode-se implementar a versão toString desejada
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
