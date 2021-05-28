package aulastatic2;

public class RelogioPontoMain {
    public static void main(String[] args){
		RelogioPonto filialCentro = new RelogioPonto(1, "Centro");
        RelogioPonto filialAlecrim = new RelogioPonto(2, "Alecrim");
        RelogioPonto filialRocas = new RelogioPonto(3, "Rocas");

		RelogioPonto.setHora(7);
		RelogioPonto.setMinuto(45);
		RelogioPonto.setSegundo(3);

		System.out.println(
			"Filial Alecrim: " +filialAlecrim.hora+ ":" +filialAlecrim.minuto+":" + filialAlecrim.segundo);
		System.out.println(
			"Filial Centro: " + filialCentro.getHora() + ":" +filialCentro.minuto+":" + filialCentro.segundo);
		System.out.println(
			"Filial Rocas: " +filialRocas.hora+ ":" +filialRocas.minuto+":" + filialRocas.segundo);
		
	}
}
