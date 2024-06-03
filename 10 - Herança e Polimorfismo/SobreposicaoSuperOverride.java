public class SobreposicaoSuperOverride {
    /*
     * Sobreposição ou sobrescrita é a implementação de um método de uma superclasse.
     * Ex: o método withdraw da classe Account é sobreposto na classe BAccount.
     * 
     * Para isso, usamos a anotação @Override. Ela não é obrigatória, mas é uma boa prática. Ex: 
     * Taxa de 5.0 é retirada do saldo ao sacar. Exceto para a SavingAccount, que não tem essa taxa.
     * @Override public void withdraw(Double amount) { balance -= amount; } para a classe SavingAccount.
     * 
     * A palavra super é usada para chamar o método da superclasse. Ex:
     * @Override public void withdraw(Double amount) { super.withdraw(amount); balance -= 2.0; } para a classe BAccount.
     * Além de tirar os 5.0, tira mais 2.0.
     * 
     */
}
