import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import entity.Employer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        int nEmployers; 
        System.out.printf("Informe o número de funcionários: ");
        nEmployers = sc.nextInt(); 

        List<Employer> myEmployers = new ArrayList<>(); 

        String fName; 
        int fId; 
        double fSalary; 
        Employer searchId; 

        for (int i = 0; i < nEmployers; i++) {
            System.out.println("Funcinário #" + (i + 1) + ":");

            System.out.printf("Id: ");
            fId = sc.nextInt();
            sc.nextLine(); 
            System.out.printf("Nome: ");
            fName = sc.nextLine(); 
            System.out.printf("Salário: ");
            fSalary = sc.nextDouble();

            myEmployers.add(new Employer(fName, fId, fSalary)); 
        }

        int idBonus; 
        System.out.printf("Informe o identificador do funcionário que receberá o bônus: ");
        idBonus = sc.nextInt();

        List<Employer> occurrences = myEmployers.stream().filter(x -> x.getId() == idBonus).collect(Collectors.toList());

        if (occurrences.size() > 1) {
            System.out.println("Repetição de ID! " + idBonus);
            System.exit(-1);
        }

        Employer bonusEmployer = myEmployers.stream().filter(e -> e.getId() == idBonus).findFirst().orElse(null);

        if (bonusEmployer == null) {
            System.out.println("Esse ID não existe.");
            System.exit(-1);
        }

        double percentage; 
        System.out.printf("Informe a porcentagem de aumento: ");
        percentage = sc.nextDouble(); 

        bonusEmployer.bonus(percentage);

        System.err.println("Lista de Funcionários: ");

        for (Employer x : myEmployers) {
            System.out.println(x.toString());
        }

        sc.close(); 
    }
}

