package avaliacao;

public class ChefeDepartamento extends Funcionario {
    // Atributos
    private String departamento;
    private String dataPromocao;
    private double gratificacao;

    // Métodos
    public void mostrarChefe() {
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Data de promoção: " + this.getDataPromocao());
        System.out.println("Gratificação: " + this.getGratificacao());
    }

    // Métodos especiais
    public ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao,
            double salario, String departamento, String dataPromocao, double gratificacao) {
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDataPromocao() {
        return dataPromocao;
    }
    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    public double getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
}
