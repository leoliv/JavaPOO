package agenda;

public class Agenda {

    private int dia;
    private int mes;
    private String anotacao;
    
    public void Agenda(int dia, int mes, String anotacao) {
        this.dia = dia;
        this.mes = mes;
        this.anotacao = anotacao;
        
        validata();
    }
    
    private void validata() {
        if (this.dia < 1 || this.dia > 30 || this.mes < 1 || this.mes > 12) {
            this.dia = 0;
            this.mes = 0;
            this.anotacao = "Error! dias e datas fora dos limites previstos!";
        }
    }
    
    public void status() {
        System.out.print(this.dia+"/"+this.mes+": "+this.anotacao+"\n");
    }
}
