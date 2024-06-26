public class PredicateLambda {
    /*
    É uma interface funcional Predicat<T> e há somente um método abstrato:

    boolean test(T t);

    Quero remover de uma lista somnte os produtos cujo o preço mínimo seja 100.00:

    list.removeIf(p -> p.getPrice() >= 100.00);

    Ou, manualmente

    public interface ProductPredicate implements Predicate<Product> {
        public boolean test(Product p) {
            return p.getPrice() >= 100;
        }
    }

    Versões
    - Reference method com método estatistco.

    Na class Product, teremos
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100;
    }

    Daí em list:

    list.removeIf(Product::staticProductPredicate);

    - Reference method com método não estático
    public boolean nonStaticProductPredicate() {
        return price >= 100;
    }

    list.removeIf(Product::nonStaticProductPredicate);

    - Variáveis

    double min = 100.0;

    Predicate<Product> pred = p -> p.getPrice() >= min;

    list.removeIf(pred);

    - Lambda Inline

    list.removeIf(p -> p.getPrice() >= min);

     */
}
