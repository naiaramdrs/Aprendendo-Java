import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class Cores {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int entradaR = scan.nextInt();
        int entradaG = scan.nextInt();
        int entradaB = scan.nextInt();

        if (entradaR < 128 || entradaG < 128 || entradaB < 128){
            System.out.println("PRETO");
        } else if (entradaR >= 128 || entradaG >= 128 || entradaB >= 128) {
            System.out.println("BRANCO");
        }

    }
}
