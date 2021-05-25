package atividade2;

public class CelularAndroid extends CelularModerno {
    private String lojaAplicativos;
    private String jogos;
    private String banco;

    // Métodos
    public void telaCelularAndroid() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Fazer chamada para o número : " + this.getChamada());
        System.out.println("Tirar uma foto do " + this.getCamera());
        System.out.println("Navegar no " + this.getWeb());
        System.out.println("Baixar o app " + this.getLojaAplicativos());
        System.out.println("Jogar o jogo " + this.getJogos());
        System.out.println("Acessar a conta do banco " + this.getBanco());
    }


    // Métodos especiais
    public CelularAndroid(boolean ligado, int chamada, String camera, String web, String lojaAplicativos, String jogos,
            String banco) {
        super(ligado, chamada, camera, web);
        this.lojaAplicativos = lojaAplicativos;
        this.jogos = jogos;
        this.banco = banco;
    }
    public String getLojaAplicativos() {
        return lojaAplicativos;
    }
    public void setLojaAplicativos(String lojaAplicativos) {
        this.lojaAplicativos = lojaAplicativos;
    }
    public String getJogos() {
        return jogos;
    }
    public void setJogos(String jogos) {
        this.jogos = jogos;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    
}
