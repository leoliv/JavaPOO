/* Considerando o código das classes Transporte, Terrestre e Automóvel apresentados na Figura 4, finalize a implementação delas, adicionando os métodos get() e set() para cada um de seus atributos. Em seguida, crie uma classe Principal com um método main() que cria um objeto da classe Automóvel, e chama todos os métodos set() e get() criados, inclusive das classes Transporte e Terrestre. Observe no seu exemplo, que é possível chamar todos os métodos get() e set() herdados pela classe Automóvel. */

package heranca;

public class Main {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        carro.setCapacidade(4);
        carro.setNumeroDeRodas(4);
        carro.setCor("Vermelho");
        carro.setNumPorta(4);
        carro.setPlaca("xy43-00");
        carro.status();
    }
}
