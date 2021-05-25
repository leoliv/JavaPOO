public class ControleRemoto {
    private Brinquedo brinquedo;
	public ControleRemoto(Brinquedo b){
		brinquedo = b;
	}
	public void mover(){
		brinquedo.mover();
	}
}
