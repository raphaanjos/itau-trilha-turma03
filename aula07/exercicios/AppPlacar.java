
public class AppPlacar {

    public static void main(String[] args) {

        Placar testar1 = new Placar();
        System.out.println(testar1);

        Placar testar2 = new Placar("São Paulo", "Corinthians");
        System.out.println(testar2);

        Placar testar3 = new Placar("São Paulo", "Corinthians", 1, 0);
        System.out.println(testar3);

    }
}
