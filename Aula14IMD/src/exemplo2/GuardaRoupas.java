package exemplo2;

import java.util.ArrayList;

public class GuardaRoupas {
    
    public ArrayList<Roupa>portaDireita; 
	public ArrayList<Roupa>portaEsquerda; 
	public ArrayList<Roupa>gavetaDireita; 
	public ArrayList<Roupa>gavetaEsquerda;

	public GuardaRoupas() { 
		this.portaDireita = new ArrayList<Roupa>(); 
		this.portaEsquerda = new ArrayList<Roupa>(); 
		this.gavetaDireita = new ArrayList<Roupa>(); 
		this.gavetaEsquerda = new ArrayList<Roupa>(); 
	} 

	public static void addRoupa(ArrayList<Roupa>compartimento, Roupa r) { 
		compartimento.add(r); 
	} 

	public static void retiraRoupa(ArrayList<Roupa> compartimento,Roupa r) { 
		if(compartimento.contains(r)) { 
			compartimento.remove(r); 
		} 
	} 

	public static void confereRoupas(ArrayList<Roupa>compartimento) { 
		for(Roupa r : compartimento) { 
			System.out.println(r); 
		} 
	} 

    public void quantidadeShow() {
		int somaRoupas = 0;
		int i = 1;
        for (Roupa roupa : portaDireita) {
			somaRoupas += i;
			i++;
		}
		i = 1;
		for (Roupa roupa : portaEsquerda) {
			somaRoupas += i;
			i++;
		}
		i = 1;
		for (Roupa roupa : gavetaDireita) {
			somaRoupas += i;
			i++;
		}
		i = 1;
		for (Roupa roupa : gavetaEsquerda) {
			somaRoupas += i;
			i++;
		}
    }
}
