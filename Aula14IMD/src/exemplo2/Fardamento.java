package exemplo2;

public class Fardamento extends Roupa {
    
    @Override
    public void lavar(){
		super.lavar();
		System.out.println("Fardamento lavado.");
	}
    @Override
	public void dobrar(){
		super.dobrar();
		System.out.println("Fardamento dobrado.");			
	}

    @Override
    public String toString(){
        return "Fardamento " + super.toString();
    }

}
