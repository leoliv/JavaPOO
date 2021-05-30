package atividade01;

public class Filha extends Mae {

    public String apelido;
    protected String esportePreferido;
    
    public Filha(String primeiroNome, String materno, String paterno) {
		super(primeiroNome, materno, paterno);
		System.out.println("Nome: " + super.nome);
        System.out.println("Sobrenome materno: " + super.getSobrenomeMaterno());
		System.out.println("Sobrenome paterno: " + super.getSobrenomePaterno());
	}
    
    public void exibir() {
        System.out.println("Apelido: " + this.apelido);
        System.out.println("Esporte Preferido: " + this.esportePreferido);
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEsportePreferido() {
        return esportePreferido;
    }

    public void setEsportePreferido(String esportePreferido) {
        this.esportePreferido = esportePreferido;
    }

}
