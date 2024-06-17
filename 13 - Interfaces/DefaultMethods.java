public class DefaultMethods {
    /*
     * A partir do java8, interfaces podem ter métodos concretos (default methos ou defender methods).
     * 
     * É uma implementação padrão, basicamente.
     * 
     * Exemplo: 
     * 
     * public interface Interface {
     *    void metodoAbstrato();
     * 
     *   default void metodoDefault() {
     *      System.out.println("Método default");
     *  }
     * }
     * 
     * A intenção é prover uma implementação padrão para métodos. Evita-se
     * 1) repetição de implementação em várias classes que implementam a interface
     * 2) necessidade de criar classes abstratas para prover implementação padrão
     * 
     * Lembre-se, diferente de classes abstratas, interfaces não podem ter atributos de instância e nem 
     * construtores.
     */
}
