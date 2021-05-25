/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Leo Oliveira
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    public Carro carro;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void ligarCarro() {
        carro.ligar();
    }
    
    public void desligarCarro() {
        carro.desligar();
    }
    
    public void acelerarCarro() {
        carro.acelerar();
    }
    
    public void frearCarro() {
        carro.frear();
    }
    
    public void setCambioCarro(int marcha) {
        carro.setCambio(marcha);
    }
}