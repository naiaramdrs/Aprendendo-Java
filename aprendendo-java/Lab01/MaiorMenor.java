import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class MaiorMenor {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        String primeiraPalavra = scan.next();
        String segundaPalavra = scan.next();

        if (primeiraPalavra.length() > segundaPalavra.length()){
            System.out.println(segundaPalavra);
            System.out.println(primeiraPalavra);
        } else if (segundaPalavra.length() > primeiraPalavra.length()) {
            System.out.println(primeiraPalavra);
            System.out.println(segundaPalavra);
        } else {
            System.out.println(primeiraPalavra);
            System.out.println(primeiraPalavra);
        }   
     }
}
