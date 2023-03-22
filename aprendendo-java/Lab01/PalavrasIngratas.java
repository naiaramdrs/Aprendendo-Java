import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Naiara Medeiros - 122110617
 */

public class PalavrasIngratas {
    public static void main(String[] args) {
           
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int vogais;
        String palavra;

        while(true){
            vogais = 0;
            palavra = scan.next();

            for (int i = 0; i < palavra.length(); i++){
                char letra = palavra.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    vogais++;
                }
            }

            if(vogais == 0){
                count++;
                System.out.println(palavra);
            }

            if(count == 3){
                break;
            }
        }
    }
}
