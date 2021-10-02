package exemplos;

public class Exemplo03 {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        numeros[0] = 12;
        numeros[1] = 16;
        numeros[4] = 178;

        /* System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[0]); */

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
