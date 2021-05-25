/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Leo Oliveira
 */
public class Livro {
    
    String corLivro;
    String conteudoLivro;
    String serieLivro;
    int identificadorLivro;

    public void setCorLivro(String corLivro) {
        this.corLivro = corLivro;
    }

    public String getCorLivro() {
        return corLivro;
    }

    public void setConteudoLivro(String conteudoLivro) {
        this.conteudoLivro = conteudoLivro;
    }

    public String getConteudoLivro() {
        return conteudoLivro;
    }

    public void setSerieLivro(String serieLivro) {
        this.serieLivro = serieLivro;
    }

    public String getSerieLivro() {
        return serieLivro;
    }

    public void setIdentificadorLivro(int identificadorLivro) {
        this.identificadorLivro = identificadorLivro;
    }
}
