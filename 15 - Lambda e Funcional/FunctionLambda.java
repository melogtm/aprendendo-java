public class FunctionLambda {
    /*
    Seu método abstrato é o

    R apply(T t);

    Leia uma lista de produtos e gera uma nova lista contendo os nomes dos produtos em caixa alta.

    - Implementando a Interface

    public class UpperCaseName implements Function<Product, String> {
        public String apply(Product p) {
            return p.getName().toUpperCase();
        }
    }

    No programa principal, teremos que utilizar uma função "map" (não confundir com a
    estrutura de dados Map):

    Aplica uma função a todos os elementos de uma STREAM (sequência):

     Conversões:

     List para stream: .stream()
     Stream para list: .collect(Collectors.toList())

     Então, no programa principal:

     List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

     names.forEach(System.out::println);

     - Reference method com Método Estático

     public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
     }

     - Reference method sem método estático

     public String nonStaticUpperCaseName() {
        name = name.toUpperCase();
     }

     - Variável

     Function<Product, String> = p -> p.getName().toUpperCase();

     - Inline

     List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


     */
}
