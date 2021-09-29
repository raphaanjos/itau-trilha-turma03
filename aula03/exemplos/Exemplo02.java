package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Digite um valor inteiro: ");
        numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo!");

        }else {
            System.out.println("O número é negativo!");

        }

        System.out.println("Fim do programa.");
        entrada.close();

    }
}
