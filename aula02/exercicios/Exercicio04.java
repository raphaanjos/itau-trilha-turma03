package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioMinimo, kwatts, valorKw, valorPagar, valorComDesconto;

        System.out.print("Informe o salário mínimo: ");
        salarioMinimo = input.nextDouble();

        System.out.print("Informe o quilowatts: ");
        kwatts = input.nextDouble();

        valorKw = ((salarioMinimo * 1) / 500);
        valorPagar = valorKw * kwatts;
        valorComDesconto = valorPagar - (valorPagar * 0.15);

        input.close();

        System.out.printf("Valor de cada quilowatts: R$ %.2f%n", valorKw);
        System.out.printf("Valor a pagar R$: %.2f%n", valorPagar);
        System.out.printf("Valor com desconto R$: %.2f%n", valorComDesconto);

        



    }
}
