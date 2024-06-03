import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class CsvReader {
    public static Double value(String quantity, String price) {
        Locale.setDefault(Locale.US);
        return Double.parseDouble(price) * Integer.parseInt(quantity); 
    }
    public static void main(String[] args) {
        // Exercício proposto em csv  Nome do produto, preço, quantidade
        // Ler o arquivo csv e criar um arquivo de saída com o nome summary.csv
        // com o nome do produto e o valor total do produto (preço * quantidade)
        // Exemplo:
        // Nome do produto, Preço, Quantidade
        // TV LED, 1290.99, 1
        // Video Game Chair, 350.50, 3
        // Iphone X, 900.00, 2
        // Saída:
        // TV LED, 1290.99
        // Video Game Chair, 1051.50
        // Iphone X, 1800.00
        
        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o caminho para o CSV: ");
        String csvPath = sc.nextLine(); 

        List<String[]> produtos = new ArrayList<>();

        boolean outCreated = new File("out").mkdir();
        
        if (!outCreated) {
            System.out.println("Pasta 'ou' já criada!"); 
        } 

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./out/summary.csv"))) {
            try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {

            String line = br.readLine(); 

            while (line != null) {
                produtos.add(line.split(",")); 
                line = br.readLine(); 
            }

            for (String[] produto : produtos) {
                bw.write(produto[0] + "," + value(produto[2].trim(), produto[1].trim()));
                bw.newLine(); 
            }

            } catch (IOException e) {
                e.printStackTrace(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    } 
}
