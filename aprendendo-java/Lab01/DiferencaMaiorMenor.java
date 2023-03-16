import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class DiferencaMaiorMenor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++){
            numeros[i] = scan.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if(num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
        }
        System.out.println(maior - menor);
    }    
}
