public class ProcessamentoECasting {
    public static void main(String[] args) {
        // O processamento de dados é o comando de atribuição : <variável> = <expressão>
        int x; 
        double y;

        x = 5;
        y = 2 * x;
        System.out.println(x); // 5
        System.out.println(y); // 10.0

        int a, b; 
        double resultado;

        a = 5;
        b = 2;
        resultado = a / b; 
        System.out.println(resultado); // 2.0 (divisão de inteiros, truncamento)

        // O casting é a conversão de um tipo de dado para outro

        resultado = (double) a / b; // casting, igual em C
        System.out.println(resultado); // 2.5

        // O compilador irá te avisar quando passar de uma variável maior para uma menor, alertando uma possível perda de informação
        double z = 5.0;
        int w; 

        w = z; // erro de compilação
        w = (int) z; // casting, sem erro de compilação, você está ciente da possível perda de informação

        // O casting é feito de forma automática em operações aritméticas
    }
}
