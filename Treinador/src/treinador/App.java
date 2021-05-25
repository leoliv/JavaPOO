package treinador;
public class App {
    public static void main(String[] args) {
        String nomeAtleta = "Bolt";
		double[] marca = {10.02, 10.0, 9.56, 9.57, 9.56}; // Uma das formas de alocar os valores

		/* marca[0] = 10.02;
		marca[1] = 10.0;
		marca[2] = 9.56;
		marca[3] = 9.57;
		marca[4] = 9.56; */
        System.out.println(nomeAtleta);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Tempo " + (i + 1) + ": " + marca[i]);
        }
    }
}
