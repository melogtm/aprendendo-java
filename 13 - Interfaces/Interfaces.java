/*
 * A partir do Java 8, as interaces podem ter "default methods"
 * > Implicações conceituais e práticas
 * > Por isso, vamos primeiro trabalhar com a definção de interfaces clássica. Depois vamos ver os "default methods"
 
    A interface é um tipo que define um conjunto de operações que uma classe deve implementar. 
    Estabelece um contrato que a classe deverá cumprir. 

    Por que usar interfaces?
    > Para definir um contrato que uma classe deve cumprir
    > Para desacoplar o código, permitindo que o mesmo método seja implementado de várias formas

    interface Shape {
        double area();
        double perimeter();
    }

    Se eu implementar uma classe Triângulo, ela deve implementar os métodos area() e perimeter() - cumprir
    o contrato.

    Problema exemplo
    Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas.
    Porém, se a duração da locação ultrapassar 12 horas, a locação será por dia.
    Além do valor da locação, é acrescido o valor do imposto conforme regras do país.
    No Brasil, o imposto é 20% abaixo de 100.00, ou 15% acima de 100.00.
    Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação),
    bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento
    (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.

    Exemplo
    Enter rental data
    Car model: Civic
    Pick-up (dd/MM/yyyy hh:mm): 25/06/2018 10:30
    Return (dd/MM/yyyy hh:mm): 25/06/2018 14:40
    Enter price per hour: 10.00
    Enter price per day: 130.00

    INVOICE:
    Basic payment: 50.00
    Tax: 10.00
    Total payment: 60.00

    Enter rental data
    Car model: Civic
    Pick-up (dd/MM/yyyy hh:mm): 25/06/2018 10:30
    Return (dd/MM/yyyy hh:mm): 27/06/2018 11:40
    Enter price per hour: 10.00
    Enter price per day: 130.00

    INVOICE:
    Basic payment: 390.00
    Tax: 58.50
    Total payment: 448.50
*/