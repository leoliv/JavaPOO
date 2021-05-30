package exemplo2;

public class Esporte extends Roupa {

    @Override
    public void lavar(){
		super.lavar();
		System.out.println("Roupa Esporte lavada.");
	}
    @Override
	public void dobrar(){
        super.dobrar();
		System.out.println("Roupa Esporte dobrada.");			
	}
    @Override
	public String toString(){
		return "Esporte " + super.toString();
	}
}
