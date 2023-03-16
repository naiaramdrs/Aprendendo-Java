import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class PalavrasPoeticas {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String primeiraPalavra = scan.next();
        String segundaPalavra = scan.next();

        if(primeiraPalavra.charAt(0) == segundaPalavra.charAt(0)){
            if(primeiraPalavra.charAt(primeiraPalavra.length()-1) == segundaPalavra.charAt(segundaPalavra.length()-1)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        } else {
            System.out.println("N");
        }

    }
}
