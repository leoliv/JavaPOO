package aulastatic;

public class RelogioPontoMain {
    public static void main(String[] args){
		RelogioPonto filialCentro = new RelogioPonto(1, "Centro");
        RelogioPonto filialAlecrim = new RelogioPonto(2, "Alecrim");
        RelogioPonto filialRocas = new RelogioPonto(3, "Rocas");

		RelogioPonto.hora = 7;
		RelogioPonto.minuto = 45;
		RelogioPonto.segundo = 30;

		System.out.println(
			"Filial Alecrim: " +filialAlecrim.hora+ ":" +filialAlecrim.minuto+":" + filialAlecrim.segundo);
		System.out.println(
			"Filial Centro: " + filialCentro.hora + ":" +filialCentro.minuto+":" + filialCentro.segundo);
		System.out.println(
			"Filial Rocas: " + filialRocas.hora + ":" +filialRocas.minuto+":" + filialRocas.segundo);
		
	}
}
