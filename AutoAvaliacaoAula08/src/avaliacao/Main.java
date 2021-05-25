package avaliacao;

public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Fernando", "4524-0432-2", "25/07/1983", "Escola Mariano");
        p1.mostrarPessoa();
        p1.mostrarAluno();

        System.out.println("----------------------------------------------");
        
        Funcionario p2 = new Funcionario("Maria", "845224-9931-4", "15/01/1998", "Empresa Misagem", "16/10/2019", 2000.00);
        p2.mostrarPessoa();
        p2.mostrarFuncionario();
        
        System.out.println("----------------------------------------------");

        ChefeDepartamento p3 = new ChefeDepartamento("José", "556432-4599-3", "02/03/1982", "Chefe Confeiteiro", "2004", 3500.00, "Confeitaria do Jordão", "25/05/2011", 560.00);
        p3.mostrarPessoa();
        p3.mostrarChefe();

    }
}
