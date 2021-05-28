package aulastatic;

public class RelogioPonto {
    public static int hora; // atributo estático
	public static int minuto; // atributo estático
	public static int segundo; // atributo estático

	private int id;
	private String nomeFilial;

	public RelogioPonto(){
	}
	
	public RelogioPonto(int ident, String filial){
		this.id = ident;
		this.nomeFilial = filial;
	}

	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNomeFilial(){
		return nomeFilial;
	}
	
	public void setNomeFilial(String nomeFilial){
		this.nomeFilial = nomeFilial;
	}
}
