package exemplo1;

public class Filha extends Mae {

    public Filha(String primeiroNome, String materno, String paterno){
		super(primeiroNome, materno, paterno);
		System.out.println("Nome: " + super.nome);
		System.out.println("Sobrenome paterno: " + super.getSobrenomePaterno());
        System.out.println("Sobrenome materno: " + super.getSobrenomeMaterno());
	}

    public static void main(String[] args) {
        Filha f = new Filha("Maria", "Damasco", "Caprichinho");
        System.out.println(f.getNome());
    }
}
