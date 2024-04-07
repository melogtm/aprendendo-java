public class FuncoesEmStrings {
    public static void main(String[] args){
        /* Checklist
        Formatar: toLowerCase(), toUpperCase(), trim()
        Recortar: substring(inicio), substring(inicio, fim)
        Substituir: Replace(char, char), Replace(string, string)
        Buscar: IndexOf, LastIndexOf
        Recortar: split(" ") 
        */

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // Converte para minúsculas - abcde fghij abc abc defg

        String s02 = original.toUpperCase(); // Converte para maiúsculas - ABCDE FGHIJ ABC ABC DEFG

        String s03 = original.trim(); // Remove espaços em branco no início e no fim - abcde FGHIJ ABC abc DEFG
    
        String s04 = original.substring(2); // Recorta a string a partir do índice 2 - cde FGHIJ ABC abc DEFG

        String s05 = original.substring(2, 9); // Recorta a string do índice 2 ao 9 - cde FGH

        String s06 = original.replace('a', 'x'); // Substitui o caractere 'a' por 'x' - xbcde FGHIJ ABC abc DEFG

        String s07 = original.replace("abc", "xy"); // Substitui a string "abc" por "xy" - xyde FGHIJ ABC xy DEFG

        int i = original.indexOf("bc"); // Retorna a posição da primeira ocorrência de "bc" - 1

        int j = original.lastIndexOf("bc"); // Retorna a posição da última ocorrência de "bc" - 17
        
        String[] vect = original.split(" "); // Divide a string em partes, com base no espaço em branco - [abcde, FGHIJ, ABC, abc, DEFG]

        
    }
}
