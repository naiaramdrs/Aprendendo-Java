import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class TesteWhile {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int num = scan.nextInt();
        while(num != -1){
            if(num % 2 == 0){
                soma+=num;
            }
            num = scan.nextInt();
        }
        System.out.println(soma);
    }
}
