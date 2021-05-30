package atividade02;

import java.util.ArrayList;

public class Componente {
    private String nome;
    private ArrayList<Peca> peca;

    public Componente(String nome, ArrayList<Peca> peca) {
        this.nome = nome;
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Peca> getPeca() {
        return peca;
    }

    public void setPeca(ArrayList<Peca> peca) {
        this.peca = peca;
    }
    
}
