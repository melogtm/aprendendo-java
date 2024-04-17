/* 
 - Boxing ou encaixotamento é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.  
 
    int x = 20;
    Object obj = x; // boxing

    Stack    |  Heap
    -----------------
    obj      |  20

    x[20]

 - Unboxing ou desencaixotamento é o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.

    int y = (int) obj; // unboxing

    Stack    |  Heap
    -----------------
    obj      |  20

    x[20]
    y[20]

 - Wrapper Classes são equivalentes aos tipos primitivos.

 Exemplo: 
    int x = 20; 
    Integer obj = x; // boxing

    int y = obj; // unboxing

    Stack    |  Heap
    -----------------
    obj      |  20

    x[20]
    y[20]

    Uso comum: o Wrapper classe aceita o valor nulo (null) e o tipo primitivo não.

    public class Product {
        private String name; 
        private Double price;
        private Integer quantity;
    }

    Isso será importantíssimo quando estivermos lidando com banco de dados.
*/

public class BoxingUnboxingWrapping {
    
}
