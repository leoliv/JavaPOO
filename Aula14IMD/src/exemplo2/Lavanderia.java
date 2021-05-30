package exemplo2;

import java.util.ArrayList;

public class Lavanderia {
    public ArrayList<Roupa> lavand;

    public Lavanderia() {
        this.lavand = new ArrayList<Roupa>();
    }
    
    public void addRoupa(ArrayList<Roupa>lavand, Roupa roupa) {
        lavand.add(roupa);
    }

    public void retirarRoupa(ArrayList<Roupa>lavand, Roupa roupa) {
        if (lavand.contains(roupa)) {
            lavand.remove(roupa);
        }
    }

    public void conferirRoupa(ArrayList<Roupa>lavand) {
        for (Roupa roupa : lavand) {
            System.out.println(roupa);
        }
    }

    public void quantidadeShow() {
		int somaRoupas = 0;
		int i = 1;
        for (Roupa roupa : lavand) {
			somaRoupas += i;
			i++;
		}
    }
}
