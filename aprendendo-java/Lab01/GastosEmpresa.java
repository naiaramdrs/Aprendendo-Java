import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class GastosEmpresa {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String entrada = scan.nextLine();
        String[] numeros = entrada.split(" ");

        int maior = 0;
        int segundoMaior = 0;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++){
            int num = Integer.parseInt(numeros[i]);

            if (num > maior){
                segundoMaior = maior;
                maior = num;   
            }else if (num > segundoMaior){
                segundoMaior = num;
                
            }
        }
        soma = maior + segundoMaior;
        System.out.println(soma);
    }    
}
