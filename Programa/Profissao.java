public class Profissao extends Pessoa{
    private String profissao;
    private String cargo;

    public Profissao(String nome, String email, int diaNasc, int mesNasc, int anoNasc, String profissao, String cargo) {
        super(nome, email, diaNasc, mesNasc, anoNasc);
        this.profissao = profissao;
        this.cargo = cargo;
    }

    public void exibir() {  // Método para exibir as informações da pessoa com profissão.
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("Profissão: " + profissao);
        System.out.println("Cargo: " + cargo);
        System.out.println();
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
