package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.model.exceptions;

public class DomainException extends RuntimeException{
    //private static final long serialVersionUID = 1L; //numero de série
    //NOTE: RunTimeException - tipo de exceção que o compilador não obriga a tratar
    //NOTE: Exception - compilador obriga a tratar

    //NOTE: Permite instanciar a exception personalizada passando uma mensagem para ela
    public DomainException(String msg){
        super(msg);
    }
}
