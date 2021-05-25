package avaliacao;

public class Pessoa {
    // Atributos
    private String nome;
    private String cpf;
    private String dataNasc;

    // Métodos
    public void mostrarPessoa() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDataNasc());
    }
    // Métodos especiais
    public Pessoa(String nome, String cpf, String dataNasc) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
