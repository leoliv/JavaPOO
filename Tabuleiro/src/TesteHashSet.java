import java.util.*;

public class TesteHashSet {
    public static void main(String[] args){
		HashSet itens = new HashSet();
		itens.add("Chocolate");
		itens.add("Bala");
		itens.add("Brigadeiro");
        
        ArrayList nomes = new ArrayList();
        nomes.add("Maria");
        nomes.add("João");

        HashMap livros = new HashMap();

		livros.put(1, "Volta ao mundo em 80 dias");
		livros.put(2, "Alice no país das maravilhas");
		livros.put(5, "Caninos Brancos ");

        System.out.println(livros);
        System.out.println(nomes);
        System.out.println(itens);
	}
}
