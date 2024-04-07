package Fixacao;

public class Estudante {
    public String name; 
    public double p1;
    public double p2;
    public double p3;

    public double calculate_average() {
        return p1 + p2 + p3; 
    }

    public String result(double average) {
        boolean hasPassed = average >= 60 ? true : false;
        if (hasPassed) {
            return "PASS"; 
        }
        System.out.printf("MISSING %.2f POINT(S)\n", (60.00 - average));
        return "FAILED";
    }
}
