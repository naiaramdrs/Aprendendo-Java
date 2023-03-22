import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class TemperaturaNegativa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperatura = scan.nextInt();
        int count = 0;
        while (temperatura != 0){
            if(temperatura < 0){
                count++;
            }
            temperatura = scan.nextInt();
        }
        System.out.println(count);
    }
}
