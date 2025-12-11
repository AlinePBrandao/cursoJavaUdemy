package M14_TratamentoExceptions.BankAccount.exceptions;

public class BusinessException extends RuntimeException {
    //NOTE: RunTimeException - tipo de exceção que o compilador não obriga a tratar
    public BusinessException(String msg){
        super(msg);
    }
}
