import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class MaiorMenorPalavra {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] palavras = new String[5];

        for(int i = 0; i < 5; i++){
            palavras[i] = scan.next();
        }

        String maiorPalavra = palavras[0];
        String menorPalavra = palavras[0];

        for (String palavra : palavras) {
            if(palavra.length() > maiorPalavra.length()){
                maiorPalavra = palavra;
            } else if (palavra.length() < menorPalavra.length()){
                menorPalavra = palavra;
            }
        }

        if(maiorPalavra.length() == menorPalavra.length()){
            maiorPalavra = palavras[0];
            menorPalavra = palavras[0];
        }
        
        System.out.println(menorPalavra);
        System.out.println(maiorPalavra);
    }
}
