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
class Carro {
    
    private String cor;
    private String tipo;
    private String placa;
    private String marca;
    private String modelo;
    private String tipoConbustivel;
    private int anoDeFabric;
    private int numPortas;
    private Pessoa dono;
    private int cambio;

    
    public Carro() {
        System.out.println("Você criou um novo objeto de classe carro!");
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        cor = c; 
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo; //This é para se referir atributo na class global.
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getTipoConbustivel() {
        return tipoConbustivel;
    }
    
    public void setTipoConbustivel(String tipoConbustivel) {
        this.tipoConbustivel = tipoConbustivel;
    }
    
    public int getAnoDeFabric() {
        return anoDeFabric;
    }
    
    public void setAnoDeFabric(int anoDeFabric) {
        this.anoDeFabric = anoDeFabric;
    }
    
    public Pessoa getDono() {
        return dono;
    }
    
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public int getCambio() {
        return cambio;
    }
    
    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    
    public void ligar() {
        System.out.println("Carro ligado!");
    }
    
    public void desligar() {
        System.out.println("Carro desligado!");
    }
    
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }
    
    public void frear() {
        System.out.println("Carro freando!");
    }
    
}
