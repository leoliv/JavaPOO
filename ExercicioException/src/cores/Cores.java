package cores;

import exep.ExcecaoCor;

/**
 * Cores
 */
public class Cores {

    public void acertarCor(String cor) throws ExcecaoCor {
        if (cor != "Azul") {
            throw new ExcecaoCor("Você errou a cor!");
        }
    }
}