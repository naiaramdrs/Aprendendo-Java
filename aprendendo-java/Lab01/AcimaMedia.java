import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class AcimaMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine();
        String[] numeros = entrada.split(" ");

        int somaNumeros = 0;
        int count = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            somaNumeros = somaNumeros + Integer.valueOf(numeros[i]);
            count++;
        }

        media = somaNumeros / count;

        for (String numero : numeros) {
            if (Integer.valueOf(numero) > media ){
                System.out.print(numero + " ");
            }
        }
    }
}
