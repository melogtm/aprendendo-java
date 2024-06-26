public class EqualsHashCode {
    /*

     São operações da classe Object utilizadas para comparar se um objeto é igual a outro

    • equals: lento, resposta 100%
    • hashCode: rápido, porém resposta positiva não é 100%

     Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações.
     Classes personalizadas precisam sobrepô-las.

     A ideia é combinar eles:

     Você compara um objeto com uma lista de 1 bilhão de objetos com .hashCode(),
     ao achar, você faz uma verificação final com .Equals() para confirmar.



   ------------------- Personalizado (comparando clientes pelo nome):

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null)) ? o : name.hashCode();
    return result;
   }

   @Override
   public boolean equals(Object obj) {
   ...
   }

   Se quiser comparar as referências de dois objetos, pode usar o == .

     */
}
