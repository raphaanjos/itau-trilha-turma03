package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salário: ");
        salario = teclado.nextDouble();

        teclado.close();

        if (salario <= 600) {
            System.out.println("Isento! ");
        }else if (salario > 600 && salario <= 1200) {
            System.out.println("Desconto de 20% INSS.");
        }else if (salario > 1200 && salario <= 200) {
            System.out.println("Desconto de 25% INSS.");
        }else {
            System.out.println("Desconto de 30% INSS.");
        }
    }
}
