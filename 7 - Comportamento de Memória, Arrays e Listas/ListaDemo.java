import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDemo {
    public static void main(String[] args){

        // List só aceita objetos, não aceita tipos primitivos
        // Generics - parametrização de tipos, informando um tipo de dado que a lista vai armazenar
        // ArrayList é uma implementação de List, pois não podemos instanciar List diretamente - Interface
        // ArrayList é otimizado para leitura, LinkedList é otimizado para inserção e remoção
        List<String> list = new ArrayList<>(); 
        
        // Adiciona elementos na lista  
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        // Adiciona um elemento na posição 2
        list.add(2, "Marco");

        // Tamanho da lista 
        System.out.println(list.size());

        // Remove um elemento da lista
        list.remove("Ana");

        // Remove um elemento da posição 1
        list.remove(1);

        // Remove um elemento a partir do predicado (expressão lambda) - remove todos os elementos que começam com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        // Encontra a posição de um elemento
        System.out.println(list.indexOf("Bob")); // -1 se não encontrar

        // Filtrar elementos
        // É massante, mas nos permite realizar operações modernas (lambda) com um tipo antigo "List"
        // Stream - trabalhar com sequência de elementos
        // Collectors - converte o resultado de volta para uma lista
        List<String> posFilter = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // Encontrar o primeiro elemento que começa com a letra A
        // findFirst - retorna o primeiro elemento que atende ao predicado
        // orElse - retorna o valor padrão caso não encontre
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        for (String x : list) {
            System.out.println(x);
        }
    }
}
