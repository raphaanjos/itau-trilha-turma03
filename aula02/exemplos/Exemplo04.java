package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome, nomeCompleto;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = entrada.nextLine();

        entrada.close();

        System.out.println("Olá " + nome + " " + sobrenome);
        System.out.println("Olá " + nomeCompleto);

        
    }
}
