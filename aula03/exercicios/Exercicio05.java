package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String senha = "R10p5";
        String inputSenha;

        System.out.print("Informe a senha: ");
        inputSenha = teclado.nextLine();

        if (senha.equals(inputSenha)) {
            System.out.println("Acesso concedido!");
        }else {
            System.out.println("Acesso Negado!");
        }
        teclado.close();
    }
}
