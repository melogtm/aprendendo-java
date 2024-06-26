public class CuringaETipos {
    /*
    Generics são invariantes.

    List<Object> não é supertipo de qualquer tipo de lista:

    List<Object> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();
    myObjs = myNumbers // erro de compilação

    O supertipo de qualquer lista é List<?>

    Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo".

    // Imprime lista de qualquer tipo
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    Porém, não é possível adicionar dados a uma lista do tipo curinga.

    ------------------- DELIMITADOS

    public static double totalArea(<? extends Shape> list)
    // Recebe como parâmetro uma lista de Shapes ou qualquer subtipo de Shapes (Circles,
    Rectangles...).
    Ainda não posso adicionar elementos.

--------- Princípio GET/PUT
    Vamos fazer um método que copia os elementos de uma lista para outra lista mais
    genérica que a primeira.

    Lembrando de Java Wrapper Types: a classe Number é intermediária entre os
    tipos Integer, Long, Short, Double... e Object.

    * Covariância
    List<Integer> intList = new ArrayList<>();

    intList.add(20);

    List<? extends Number> list = intList;

    Number x = list.get(0); // OK
    list.add(10); // Erro de compilação

    Quando podemos usar get e não podemos fazer o put, temos a covariância.

    * Contracovariância

    List<Object> myObjs = new ArrayList<>();
    myObjs.add("Maria");
    myObjs.add("Alex");

    // Pode ser um Number ou qualquer SUPERtipo de Number (Object)
    List<? super Number> myNums = myObjs;

    myNums.add(10); OK
    myNums.add(3.14); OK

    Number x = myNums.get(0); // Erro de compilação

    Não podemos dar get, mas podemos fazer o put.

    No código, o ato de iterar sobre os items de uma lista é um ato de covariância,
    e de adicionar elementos, um ato de contra-covariância.
     */
}
