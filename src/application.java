public class application {

    public static void main (String [] args){

        String primeiroNome = "Aline";
        String segundoNome = "Brandão";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
