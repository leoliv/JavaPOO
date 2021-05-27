package exceptioncarro;

import exceptions.CarroException;

public class Carro {
    private String marca;
    private int quantPortas;
    private String dono;
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Carro desligado");
    }

    public void verificar(String dono) {
        String trueDono = "Jose";
        if (this.dono.equalsIgnoreCase(trueDono)) {
            throw new CarroException("Error: Esse não é o dono do carro!");
        }
    }

    public Carro(String marca, int quantPortas, String dono) {
        this.marca = marca;
        this.quantPortas = quantPortas;
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
