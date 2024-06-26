public class Comparator {
    /*

    Veja bem, se definimos um critério de comparação com Comparator<T>, e precisamos mudar
    esse critério, precisamos ir para o método compareTo e mudar essa regra.

    Isso, em termos de manutenção, é horrível. Logo, vamos usar o default method sort(Comparator<? super E>
    de List<>

    list.sort(new MyComparator());

    public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    }

    ou no meio do programa principal, podemos declarar um comparator por função anônima

    Comparator<Product> comp = new Comparator<Product>() {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    }

    Ou usaremos lambda

    Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());



     */
}
