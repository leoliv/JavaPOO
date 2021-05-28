package aulainterface;

public class ControleRemoto {
    public void moverObjetoParaFrente(Mobilidade obj){
		obj.andarFrente();
	}
	public void moverObjetoParaTras(Mobilidade obj){
		obj.andarTras();
	}
	public void dobrarADireita(Mobilidade obj){
		obj.virarDireita(34);
	}
	public void dobrarAEsquerda(Mobilidade obj){
		obj.virarEsquerda(50);
	}
}
