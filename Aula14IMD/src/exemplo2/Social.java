package exemplo2;

public class Social extends Roupa {
    
    @Override
    public void lavar(){
		super.lavar();
		System.out.println("Roupa Social lavada.");
	}
    @Override
	public void dobrar(){
		super.dobrar();
		System.out.println("Roupa Social dobrada.");			
	}
    @Override
	public String toString(){
		return "Social " + super.toString();
	}
}
