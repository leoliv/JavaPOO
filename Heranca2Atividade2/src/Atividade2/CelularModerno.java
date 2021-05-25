package Atividade2;

public class CelularModerno extends CelularMae {
    protected String camera;
    protected String web;
    
    public void telaCelularModerno() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Fazer chamada para o número : " + this.getChamada());
        System.out.println("Tirar uma foto do " + this.getCamera());
        System.out.println("Navegar no " + this.getWeb());
    }

    // Métodos especiais
    public CelularModerno(boolean ligado, int chamada, String camera, String web) {
        super(ligado, chamada);
        this.camera = camera;
        this.web = web;
    }
    
    public CelularModerno(boolean ligado, int chamada) {
        super(ligado, chamada);
        this.camera = "Cachorrinho";
        this.web = "YouTube";
    }

    public String getCamera() {
        return camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }
    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    
}
