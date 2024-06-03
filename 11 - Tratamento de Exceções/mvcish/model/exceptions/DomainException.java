package model.exceptions;

/*
RuntimeException é uma exceção que o compilador não obriga você a tratar.
Você pode tratar se quiser.

Exception é uma exceção que o compilador obriga você a tratar.
 
*/

public class DomainException extends Exception {
    
    private static final long serialVersionUID = 1L; // Serialização, será explicado mais a frente no curso

    public DomainException(String msg) {
        super(msg); // Irá nos permitir passar uma mensagem para a exceção
    }
}
