import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Adivinha {
   public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();
    int tentativa = 0;
    while (tentativa != numero){
        tentativa = scan.nextInt();

        if(tentativa > numero){
            System.out.println("MAIOR");
        } else if (tentativa < numero){
            System.out.println("MENOR");
        } else {
            System.out.println("ACERTOU");
        }
    }
   } 
}
