public class Stream {
    /*
    É uma sequência de  elementos advinda de uma fonte de dados (coleção, array, função de iteração, recurso de E/S...)

    É uma solução para processar uma sequência de dados de forma:
    1. Declarativa (iteração interna, escondida)
    2. Parallel-friendly (imutável / thread safe) - facilidade de trabalhar com paralelismo.
    3. Sem efeitos colaterais.
    4. Os dados só serão consumidos quando necessários (sob demanda).

    Acesso sequencial e single-use (só pode ser usada uma vez).

    Pipeline: operações em stremas retornam novas streams, logo, é possível
    criar uma cadeia de operações (fluxo de processamento).

    O pipeline é composto por zeros ou mais operações intermediários e uma terminal.

    * Operação intermediária
    Produz uma nova stream, só executa quando uma operação terminal é invocada.

    * Operação terminal
    Produz um objeto não-stream, determina o fim do processamento de uma stream.

    Operações intermediárias:
    * FILTER
    * MAP
    * FLATMAP
    * PEEK
    * DISTINCT
    ...
    * LIMIT (corta a operação, short-circuit).

    Operações terminais:
    forEach
    forEachOrdered
    toArray

    findFirst
    ...

    Crirar uma stream: basta chamar .stream ou parallelStream a partir de qualquer objeto
    Collection.

    Outras formas de criar uma stream incluem:
    Stream.of
    Stream.ofNullable
    stream.iterate

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> sti = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(sti.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Bob", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3> = st3 = Stream.iterate(0, x -> x + 2); // É infinita
        System.out.println(Arrays.toString(st2.limit(10).toArray())); // Agora sim, limitamos

        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}.map(p -> p[0])); // FIBONACCI


    }


     */
}
