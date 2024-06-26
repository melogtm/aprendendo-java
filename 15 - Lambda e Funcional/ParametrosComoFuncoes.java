public class ParametrosComoFuncoes {
    /*
    Recordando

    removeIf(Predicate)

    forEach(Consumer)

    map(Function)

    Faça um programa que, a partir de uma lista de produtos, calcule a soma dos preços
    somente dos produtos cujo nome começa com "T"

    Pense numa classe:

    public double filteredSum(List<Product> list) {
        double sum = 0.0;

        for (Product p : list) {
            if (p.getName().charAt(0) == 'T') {
                sum += p.getPrice();
            }
        }

        return sum;
    }

    No programa principal:

    ProductService ps = new ProductService();

    double sum = ps.filtredSum(list);

    Há como melhorar, isto é, fechar a ProductService para alterações

    Recebemos a condição como parâmetro e aplicamos ela no if:

    public double filtredSum(List<Product> list, Predicate<Product> pred) {
        ...
        if (pred.test(p)) {
        ...
    }

    double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

     */
}
