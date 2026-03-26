public class Pessoa {
    private String nome;
    private String email;
    private int diaNasc, mesNasc, anoNasc, idade;

    public Pessoa(String nome, String email, int diaNasc, int mesNasc, int anoNasc, int idade) {
        this.nome = nome;
        this.email= email;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.idade = idade;
    }

    public void exibir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println();
    }

    public static int defineIdade(int diaNasc, int mesNasc, int anoNasc){
        int idade;

        if (mesNasc < 6 || (mesNasc == 6 && diaNasc <= 15)) {
            idade = 2026 - anoNasc;
        } else {
            idade = 2026 - anoNasc - 1;
        }

        return idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return defineIdade(diaNasc, mesNasc, anoNasc);
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
}