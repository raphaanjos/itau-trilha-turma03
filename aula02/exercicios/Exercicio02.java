package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        double nota1 = input.nextDouble();

        System.out.print("Informe a segunda nota do aluno: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média é " + media);

        input.close();
    }
    
}
