public class ConsumerLambda {
    /*
    Consumer é uma interface funcional com um método abstrato:

    void accept(T t);

    Em um programa, a partir de uma lista de produtos, aumente os preços em 10%

    - Creidna uma classe que implemente o Consumer
    public class PriceUpdate implements Consumer<Product> {
        @Override
        public void accept(Product p) {
            p.setPrice(p.getPrice * 1.1);
        }
    }


    list.forEach(new PriceUpdate());

    list.forEach(System.out::println);

    - Reference method com método estático
    Em Product:

    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    list.forEach(Product::staticPriceUpdate);

        - Reference method com método não estático
    Em Product:

    public void nonStaticPriceUpdate() {
        price *= 1.1;
    }

    list.forEach(Product::nonStaticPriceUpdate);

     - Variável

     Consumer<Product> cons = p -> p.setPrice(p.getPrice * 1.1);

     list.forEach(cons):

     - Inline

     list.forEach(p -> p.setPrice(p.getPrice * 1.1));
     */
}
