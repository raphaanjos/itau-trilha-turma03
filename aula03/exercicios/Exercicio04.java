package exercicios;

import java.util.Scanner;

public interface Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao, limite;


        System.out.print("Informe o salário: ");
        salarioBruto = teclado.nextDouble();
        System.out.print("Informe valor da prestação: ");
        valorPrestacao = teclado.nextInt();
        limite = salarioBruto * 0.3;

        teclado.close();

        if (valorPrestacao <= limite){
            System.out.println("Pode receber o empréstimo.");
        }else {
            System.out.println("Empréstimo negado.");
        }

       

    }

}
