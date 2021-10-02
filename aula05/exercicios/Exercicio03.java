package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomes[] = new String[2];
        System.out.println(nomes.length);

        for(int i = 0; i < nomes.length; i++) {
            System.out.printf("Insira o %d nome: ", (i+1));
            nomes[i] = teclado.nextLine();
        }

        for(int j = nomes.length; j >= 0 ; j--) {
            if (j > 0) {
                System.out.print(nomes[j] + ", ");
            }else {
                System.out.print(nomes[j] + ". ");
            }
        }

        teclado.close();
      
    }
}
