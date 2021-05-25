package avaliacao;

public class Aluno extends Pessoa {
    // Atributos
    private String matricula;

    // Métodos
    public void mostrarAluno() {
        System.out.println("Matricula: " + this.getMatricula());
    }
    
    // Métodos especiais
    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
