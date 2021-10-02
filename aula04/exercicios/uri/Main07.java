package exercicios.uri;


/* 
	1059	
Faça um programa que mostre os números pares entre 1 e 100, inclusive.

Entrada
Neste problema extremamente simples de repetição não há entrada.

Saída
Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha.
*/

public class Main07 {

    public static void main(String[] args) {
        
        int cont = 1;
        
        while (cont <= 100) {
            if (cont % 2 == 0) {
              System.out.println(cont);
            }
           
            cont++;
        }
    }
    
}
