public class TiposReferenciasEValor {
    /*
     * Classes são tipos de referência. 
     * Ou seja, quando instanciamos uma classe, estamos criando uma referência para um objeto na memória.
     */
    public static void main(String[] args) {
        // Suponha que haja uma classe Product
        // Product p1, p2;
        /*
        p1 e p2 estão na stack, e não na heap.
        
        Quando damos p1 = new Product(), estamos criando um objeto na memória Heap e p1 é uma referência para esse objeto.
        
        Stack
        p1 -> 0x1ff3
        p2 -> null

        Heap
        0x1ff3 -> Product { TV, 900.00 }

        Quando p2 = p1, estamos fazendo com que p2 aponte para o mesmo objeto que p1.

        p1 e p2 são referências para objetos na memória.

        Se p2 = null, p2 deixa de apontar para o objeto na memória Heap.
        */

        /*
            Tipos primitivos são tipos valor
            
            Tipos valor são aqueles que armazenam diretamente seus dados.

            double x, y; // x e y estão na stack

            x = 10.0; 
            y = x; // y recebe o valor de x, ou seja, 10.0;

            x = 20.0; // y continua com o valor 10.0, pois x e y são independentes.

            - Valores Padrão
            
            Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuidos valores padrão para cada tipo de dado.

            Product p = new Product(); // name: null, price: 0.0, quantity: 0
            * números: 0
            * boolean: false
            * char: '\u0000' (código do caractere 0)
            * objetos: null
        */
    }
}