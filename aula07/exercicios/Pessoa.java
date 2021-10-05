public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome : " + this.nome + ", telefone" + this.telefone;
    }

    



}
