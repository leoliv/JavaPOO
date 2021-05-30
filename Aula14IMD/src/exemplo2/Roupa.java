package exemplo2;

public class Roupa {
    private String descricao;
	private String cor;
	private String situacao;
	private String estampa;
	private int manequim;
    private int numManequim;
    private String tecido;
    private double preco;

	public Roupa(){
	}
	
	public void dobrar(){
        System.out.println("Roupa dobrada");
	}
	public void lavar(){
        System.out.println("Roupa lavada");
	}
    @Override
	public String toString(){
        return this.descricao + " " + this.cor + " " + this.manequim + " " + this.situacao;
	}

    //gets e sets

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }

    public int getManequim() {
        return manequim;
    }

    public void setManequim(int manequim) {
        this.manequim = manequim;
    }

    public int getNumManequim() {
        return numManequim;
    }

    public void setNumManequim(int numManequim) {
        this.numManequim = numManequim;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
