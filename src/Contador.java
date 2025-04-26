import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o primeiro parametro");
       int numero_1 = scanner.nextInt();
       System.out.println("Insira o segundo parametro");
       int numero_2 = scanner.nextInt();

       
        try {
            contar(numero_1, numero_2);
            
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
           
        }
    }


    static void contar(int numero_1, int numero_2) throws ParametrosInvalidosException{

        if(numero_1 > numero_2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
       int contagem = numero_2 - numero_1;

       for(int i= 0; i < contagem; i++){
        int contador = i + 1;
        System.out.println("Imprimindo o numero " + contador);
       }
    }
}
