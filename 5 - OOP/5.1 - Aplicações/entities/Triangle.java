package entities; // Pacote da Classe

// Projeto da Classe (UML) - Diagrama de Classe
/*
 * Triangle
 * - A : double
 * - B : double
 * - C : double
 * ---------------------
 * + calcular_area() : double
 */

public class Triangle {
    // Atributos da classe
    public double a;
    public double b;
    public double c;

    // Public - Acesso total a todos os métodos e atributos da classe por outros arquivos.
    /*
     Benefícios: 
        - Facilidade de uso
        - Facilidade de manutenção
        - Facilidade de depuração
        - Facilidade de reutilização
        - Facilidade de extensão
        - Delegação de responsabilidade 
    */
    public double calcular_area() {
        // Fórmula de Heron para calcular a área de um triângulo
        double semi_per = (a + b + c) / 2.0; 

        return Math.sqrt((semi_per*(semi_per - a)*(semi_per - b)*(semi_per - c))); 
    }
}
