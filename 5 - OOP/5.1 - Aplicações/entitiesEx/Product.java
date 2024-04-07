package entitiesEx;

public class Product {
    public String nome; 
    public double preco; 
    public int quantidade; 

    public String mostrar_dados() {
        return "Nome: " + nome + "\n" + "Preço: " + preco + "\n" + "Quantidade em Estoque: " + quantidade + "\n" + "Valor total no Estoque: " + (quantidade * preco); 
    }

    public void alocar(int quantitade) {
        // this - palavra reservada que faz referência ao objeto que está executando o método 
        this.quantidade += quantitade; 
    }
    
    public void retirar(int quantidade) {
        this.quantidade -= quantidade; 
    }
}
