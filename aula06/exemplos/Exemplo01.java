package exemplos;

public class Exemplo01 {
    
    public static void main(String[] args) {
        linha();

        System.out.println("Meu programa v.1");
        int tamanho = "Opções".length();
        linha2(tamanho);
        linha();
        linha3(10, '#');
    }

    public static void linha() {
        System.out.println("------------");
    }

    public static void linha2(int tamanho) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }

        System.out.println();
    }

    public static void linha3(int tamanho, char letra) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print(letra);
        }

        System.out.println();
    }
}
