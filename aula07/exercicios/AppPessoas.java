public class AppPessoas {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("John Doe", "1263.4561");
        System.out.println(p1);

        Estudante p2 = new Estudante("John Doe", "1263.4561", "Java");
        System.out.println(p2);

        Professor p3 = new Professor("John Doe", "1263.4561", 7000);
        System.out.println(p3);
    }
}
