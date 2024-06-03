import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Acesso ao arquivo
        File f = new File("./base.txt");

        // Leitura - Versão menos enxuta
        Scanner sc = null; 

        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) { // Sem isso, pode dar NullPointerException
                sc.close();
            }
        }

        // FileReader e BufferedReader
        /*
            FileReader - stream / sequência de leitura a partir de um arquivo. 
            
            BufferedReader - classe que permite a leitura de um arquivo de texto a partir de um buffer de memória.
            Mais rápido! 
        */
        // FR e BR - Processo manual
        String path = "./base.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path); 
            br = new BufferedReader(fr); // FileReader é passado como argumento para o BufferedReader

            String line = br.readLine(); // Lê a primeira linha

            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // Lê a próxima linha
            }
        } catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { // Fechando os recursos
                if (br != null) {
                    br.close(); // Pode dar outro IOException
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // FR e BR - Processo automático (Bloco try-with-resources)
        // Bloco try-with-resources - é uma forma simplificada de se trabalhar com recursos que precisam ser fechados.
        try (BufferedReader bwr = new BufferedReader(new FileReader(path))) {
            String line = bwr.readLine(); // Lê a primeira linha

            while (line != null) {
                System.out.println(line);
                line = bwr.readLine(); // Lê a próxima linha
            }
        } catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        } 

        // FileWriter e BufferedWriter
        /*
            FileWriter - stream / sequência de escrita a partir de um arquivo. 
            
            * Cria / recria o arquivo: new FileWriter(path)
            * Acrescenta ao arquivo: new FileWriter(path, true)

            BufferedWriter - classe que permite a escrita de um arquivo de texto a partir de um buffer de memória.
            Mais rápido! 
        */

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // Pula linha; quebra de linha no arquivo
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Manipulando Pastas
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        // Note, não está limitado a arquivos de texto, mas pastas e arquivos em geral 
        File pathFolder = new File(strPath);

        // Listando pastas
        // ::isDirectory - método de referência, será abordao mais adiante  
        File[] folders = pathFolder.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Listando arquivos
        File[] files = pathFolder.listFiles(File::isFile);

        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        // Criando subpasta
        boolean success = new File(strPath + "/subdir").mkdir();

        System.out.println("Directory created successfully: " + success);

        // Informações no Caminho do Arquivo 
        System.out.println("Enter a file path: ");
        String strFilePath = sc.nextLine();

        File filePath = new File(strFilePath);

        System.out.println("getName: " + filePath.getName()); // Nome do arquivo
        System.out.println("getParent: " + filePath.getParent()); // Caminho do arquivo desprezando nome 
        System.out.println("getPath: " + filePath.getPath()); // Caminho do arquivo completo
    }    
}
