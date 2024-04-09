public class GarbageCollector {
    /*
        * Garbage Collector - processo que automatiza a gerência de memória do programa. 

        Ele monitora os objetos alocados na memória Heap e, quando um objeto não tem mais referência para ele, ele libera a memória ocupada por esse objeto.

        O Garbage Collector é executado automaticamente pelo Java, mas é possível forçar a execução dele com o método System.gc().

        É um processo pesado, então não é recomendado forçar a execução dele.

        * Dealocação por escopo - a memória Stack é liberada quando o escopo do objeto é finalizado.
    */
    public static void main(String[] args) {
        /*
        Product p1, p2;
        
        p1 = new Product("TV", 900.00);
        p2 = new Product("Notebook", 1200.00);

        p1 = p2; // p1 deixa de apontar para o objeto "TV" e passa a apontar para o objeto "Notebook".

        O objeto {"TV", 900.00} não tem mais referência para ele, então o Garbage Collector libera a memória ocupada por ele.

        */
    }
}
