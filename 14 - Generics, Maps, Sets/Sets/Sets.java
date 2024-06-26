public class Sets {
    /*
    Representa um conjunto de elementos:
    1. Não admite repetições.
    2. Elementos não possuem posição.
    3. Acesso, inserção e remoção de elementos são rápidos.
    4. Oferece operações eficientes de conjuntos: interseção, união e diferença.

    Principais implementações:
    * HashSet - mais rápido e não ordenado
    * TreeSet - mais lento e ordenado pelo compareTo do objeto
    * LinkedHashSet - velociddade intermediária e elementos na ordem em que são adiconados.

    .add
    .clear
    .size
    .removeIf

    .addAll(other) - união
    .retainAll(other) - interseção
    .removeAll(other) - diferença

    Exemplo de implementação

    Set<String> set = new HashSet<>();
    Set<String> set = new TreeSet<>();
    Set<String> set = new LinkedHashSet<>();

    set.removeIf(x -> x.length() >= 3);
    ------------------------------------------

    Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
    Set<Integer> b = new TreeSet<>(Array.asList(5,6,7,8,9,10));

    // união
    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);

    // Intersecção
    Set<Integer> d = new TreeSet<>(a);
    c.retainAll(b);

    // Diferença
    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);

    -------------------------------------------------
    Atenção, se você não especificar o hashCode e Equals em sua classe

    .contains fará a comparação via ponteiros, isto é, não analisando o conteúdo,
    mas se são os mesmos valores de referência.

     */
}