package nomes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nomes.models.Funcionario;

public class Program {
    public static void main(String args[]) {
        List<Funcionario> lista = new ArrayList<>();
        String path = "./in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine(); 

            while(funcionarioCsv != null) {
                String[] fields = funcionarioCsv.split(",");
                lista.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCsv = br.readLine();
            }

            Collections.sort(lista);

            for(Funcionario s : lista) {
                System.out.println(s.getName() + ", " + s.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
