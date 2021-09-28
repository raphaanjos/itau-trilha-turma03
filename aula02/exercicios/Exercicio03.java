package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.print("\nInforme o salário do funcionário: ");
        salario = entrada.nextDouble();

        novoSalario = salario + (salario * 0.25);

        System.out.println("Novo salário: " + novoSalario);
        entrada.close();
    }
}
