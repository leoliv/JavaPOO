package atividade02;

import java.util.ArrayList;

public class Motor extends Componente {
    private ArrayList<Componente> componente;

    public Motor(ArrayList<Componente> componente, String nome, ArrayList<Peca> peca) {
        super(nome, peca);
        this.componente = componente;
    }

    public ArrayList<Componente> getComponente() {
        return componente;
    }

    public void setComponente(ArrayList<Componente> componente) {
        this.componente = componente;
    }
    
    public static void main(String[] args) {
        // Criando objetos peca 
        Peca p1 = new Peca("tipo1", "10Kg", "ferro");
        Peca p2 = new Peca("tipo2", "5Kg", "aluminio");
        Peca p3 = new Peca("tipo3", "2Kg", "plastico");
        Peca p4 = new Peca("tipo4", "3Kg", "aluminio");
        Peca p5 = new Peca("tipo5", "8Kg", "ferro");
        
        // Definindo uma lista de peças que gera um componente 
        ArrayList<Peca> componente1 = new ArrayList<Peca>();
        componente1.add(p1);
        componente1.add(p2);
        componente1.add(p3);

        // Definindo uma lista de peças que gera outro componente 
        ArrayList<Peca> componente2 = new ArrayList<Peca>();
        componente2.add(p4);
        componente2.add(p5);

        // Definindo a lista de componente que formam o Motor
        ArrayList componentes_motor = new ArrayList<Componente>();
        componentes_motor.add(componente1);
        componentes_motor.add(componente2);
        
        // Definindo a lista de peças que formam o Motor
        ArrayList pecas_motor = new ArrayList<>();
        pecas_motor.add(p1);
        pecas_motor.add(p2);
        pecas_motor.add(p3);
        pecas_motor.add(p4);
        pecas_motor.add(p5);

        // Construindo Motor
        Motor n = new Motor(componentes_motor, "motor", pecas_motor);
    }
}
