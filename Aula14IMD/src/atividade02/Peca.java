package atividade02;

public class Peca {
    private String tipo;
    private String peso;
    private String material;

    public Peca(String tipo, String peso, String material) {
        this.tipo = tipo;
        this.peso = peso;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
