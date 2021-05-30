package exemplo1;

public class Mae {
    private int idade;
	protected String nome;
	private String sobrenomeMaterno;
	private String sobrenomePaterno;

	public Mae(String primeiroNome, String materno, String paterno){
        // super();
	    this.nome = primeiroNome;
		this.sobrenomeMaterno = materno;
		this.sobrenomePaterno = paterno;
	}	
	public String toString(){
		return nome + " "+sobrenomeMaterno + " " + sobrenomePaterno;
	}


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenomeMaterno() {
        return sobrenomeMaterno;
    }
    public void setSobrenomeMaterno(String sobrenomeMaterno) {
        this.sobrenomeMaterno = sobrenomeMaterno;
    }
    public String getSobrenomePaterno() {
        return sobrenomePaterno;
    }
    public void setSobrenomePaterno(String sobrenomePaterno) {
        this.sobrenomePaterno = sobrenomePaterno;
    }

}
