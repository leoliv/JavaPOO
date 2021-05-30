package exemplo2;

public class VestuarioMain {
    public static void main(String[] args) {
        GuardaRoupas guardaRoupas = new GuardaRoupas(); 

		Esporte camiseta = new Esporte(); 
		camiseta.setCor("branca"); 
		camiseta.setDescricao("regata"); 
		camiseta.setManequim(40); 

		Social terno = new Social();
        terno.setDescricao("terno");
		terno.setCor("cinza"); 
		terno.setManequim(44);

		Social camisa = new Social(); 
        camisa.setDescricao("camisa");
		camisa.setCor("verde"); 
		camisa.setManequim(40); 

		Fardamento bata = new Fardamento();
        bata.setDescricao("bata");
		bata.setCor("azul");
        bata.setManequim(55);

		GuardaRoupas.addRoupa( guardaRoupas.portaDireita, camiseta ); 
		GuardaRoupas.addRoupa( guardaRoupas.portaEsquerda, terno ); 
		GuardaRoupas.addRoupa( guardaRoupas.portaEsquerda, camisa ); 
		GuardaRoupas.addRoupa( guardaRoupas.gavetaDireita, bata ); 

		GuardaRoupas.confereRoupas( guardaRoupas.portaDireita ); 
		GuardaRoupas.confereRoupas ( guardaRoupas.portaEsquerda ); 
		GuardaRoupas.confereRoupas( guardaRoupas.gavetaDireita ); 
		GuardaRoupas.confereRoupas( guardaRoupas.gavetaEsquerda );
    }
}
