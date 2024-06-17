package nomes.models;

/*
 * 
 * Se eu quiser que o meu funcionário seja ordenável eu preciso implementar a interface Comparable.
 */

public class Funcionario implements Comparable<Funcionario> {
    private String name; 
    private Double salary;

    public Funcionario(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Comparar um objeto com outro, como comparo esse objeto com outro informado (o)
    @Override
    public int compareTo(Funcionario other) {
        /*
         * retorna um inteiro negativo se o objeto atual for menor que o objeto o. (alex < maria)
         * retorna zero se o objeto atual for igual ao objeto o. (maria maria)
         * retorna um inteiro positivo se o objeto atual for maior que o objeto o (maria > alex).
         */
        // para ordem decrescente: return -this.name.compareTo(other.getName());
        return this.name.compareTo(other.getName()); 
    }
}
