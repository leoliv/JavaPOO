package avaliacao;

public class Funcionario extends Pessoa {
    // Atributos
    private String matricula;
    private String dataAdmissao;
    private double salario;

    // Métodos
    public void mostrarFuncionario() {
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Data de admissão: " + this.getDataAdmissao());
        System.out.println("Salário: " + this.getSalario());
    }

    protected Funcionario(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao, double salario) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
