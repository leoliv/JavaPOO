package atividade01;

public class Neta extends Filha {
    
    public Neta(String primeiroNome, String materno, String paterno) {
       super(primeiroNome, materno, paterno);
    }

    public void exibir(String apelido, String esportePreferido) {
        // System.out.println("Nome: " + super.getNome());
        // System.out.println("Sobrenome materno: " + super.getSobrenomeMaterno());
        // System.out.println("Sobrenome paterno: " + super.getSobrenomePaterno());
        super.apelido = apelido;
        super.esportePreferido = esportePreferido;
        System.out.println("Apelido: " + super.getApelido());
        System.out.println("Esporte favorito: " + super.getEsportePreferido());
    }
}
