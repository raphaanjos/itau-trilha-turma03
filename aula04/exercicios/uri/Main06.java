package exercicios.uri;

import java.util.Scanner;

/* 
1048
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	Percentual de Reajuste
0 - 400.00          15%
400.01 - 800.00     12%
800.01 - 1200.00    10%
1200.01 - 2000.00   7%
Acima de 2000.00    4%



Leia o salário do funcionário e calcule e mostre o novo salário,
bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, 
conforme exemplo abaixo.
 */


public class Main06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double valorReajuste;
        double novoSalario;
    
        double salario = scan.nextDouble();

        valorReajuste = 0;
        novoSalario = 0;
        if (salario >= 0 && salario <= 400.00) {
            valorReajuste = salario * 0.15;
            System.out.println("# " + valorReajuste);
            novoSalario = salario + valorReajuste;
            System.out.printf("Novo salário: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 15 %");

        }else if (salario >= 400.01 && salario <= 800.00) {
            valorReajuste = salario * 0.12;
            novoSalario = salario + valorReajuste;
            System.out.printf("Novo salário: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 12 %");
            
        }else if (salario >= 800.01 && salario <= 1200.0) {
            valorReajuste = salario * 0.10;
            novoSalario = salario + valorReajuste;
            System.out.printf("Novo salário: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 10 %");
            
        }else if (salario >= 1200.01 && salario <= 2000.0) {
            valorReajuste = salario * 0.07;
            novoSalario = salario + valorReajuste;
            System.out.printf("Novo salário: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 7 %");
            
        }else if (salario >= 2000.00) {
            valorReajuste = salario * 0.04;
            novoSalario = salario + valorReajuste;
            System.out.printf("Novo salário: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
            System.out.println("Em percentual: 4 %");
            
        }

        scan.close();
    }
}
