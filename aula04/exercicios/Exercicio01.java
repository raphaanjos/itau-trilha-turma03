package exercicios;

public class Exercicio01 {

    public static void main(String[] args) {
        
        int cont = 100;

        while(cont <= 200) {
            
            if (cont == 200) {
                System.out.printf("%d. ", cont);
            }else {
                System.out.printf("%d, ", cont);
            }
            cont++;
        }
    }
    
}
