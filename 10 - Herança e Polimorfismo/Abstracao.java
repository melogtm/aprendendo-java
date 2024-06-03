public class Abstracao {
    /*
    Classes que não podem ser instanciadas. São utilizadas como base para outras classes.

    É uma forma de garantir herança total: somente as classes filhas podem ser instanciadas.

    Na notação UML, classes abstratas são representadas por um nome em itálico.

    Exemplo:
    public abstract class Animal {
        public abstract void emitirSom();
    }

    Motivos para usar classes abstratas:
    - Garantir herança total
    - Evitar instanciar objetos de uma classe que não faz sentido
    - Definir métodos que devem ser implementados pelas classes filhas
    - Reuso
    - Polimorfismo (coleções)
      

    Seguindo a mesma lógica, métodos abstratos são métodos que não possuem implementação e devem ser implementados pelas classes filhas.

    Métodoos precisam ser abstratos caso a sua implementação não faça sentido na classe pai.
    Exemplo:

    public abstract class Shape {
        public abstract double area();
    }

    public class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    Se houver um método abstrato em uma classe, a classe também deve ser abstrata.
    */
}
