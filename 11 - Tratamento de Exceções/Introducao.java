public class Introducao {
    /*
    Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.

    Em Java, uma exceção é um objeto herdado da classe:
        - java.lang.Exception: o compilador obrigar a tratar ou lançar a exceção.
        - java.lang.RuntimeException: o compilador não obriga a tratar ou lançar a exceção.

    Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja tratada.
    
    Hierarquia de exceções:
        - Throwable
            - Error: não se espera que o programa trate.
                - OutOfMemoryError
                - VirtualMachineError
            - Exception: o compilador obriga a tratar ou lançar.
                - RuntimeException: o compilador não obriga a tratar ou lançar.
                    - NullPointerException
                    - IndexOutOfBoundsException
                - IOException

        Ver mais em https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html
    */
}
