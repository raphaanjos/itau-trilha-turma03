package exercicios.uri;

import java.util.Scanner;

/* 
	1114
Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o
algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/

public class Main09 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final int SENHA = 2002;
        int inputSenha;
        boolean valido = false;

       do {
            System.out.print("Insira a senha: ");
            inputSenha = input.nextInt();

            if (inputSenha == SENHA) {
                System.out.println("Acesso Permitido");
                valido = true;
            }else {
                System.out.println("Senha Invalida");
                valido = false;
            }

       } while (valido == false);

       input.close();
    }
}
