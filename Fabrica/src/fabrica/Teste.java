package fabrica;


public class Teste {
    public static void main(String args[]){
        
        System.out.println("Meu primeiro programa em java!");
        
        Carro meuCarro = new Carro();
        Carro carro2 = new Carro();
        Pessoa p1 = new Pessoa();
        meuCarro.setCor("Preto");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("MHX 1234");
        meuCarro.setTipo("esportivo");
        meuCarro.setMarca("Volkswagen");
        meuCarro.setModelo("Jetta GLI");
        meuCarro.setTipoConbustivel("Gasolina");
        meuCarro.setAnoDeFabric(2021);
        meuCarro.setDono(p1);
        p1.setNome("Ana");
        System.out.println(meuCarro.getDono().getNome());
        p1.setCarro(carro2);
        p1.ligarCarro();
        p1.setCambioCarro(1);
        p1.acelerarCarro();
        p1.setCambioCarro(2);
        p1.acelerarCarro();
        p1.setCambioCarro(3);
        p1.acelerarCarro();
        p1.setCambioCarro(2);
        p1.acelerarCarro();
        p1.setCambioCarro(1);
        p1.acelerarCarro();
        p1.setCambioCarro(0);
        p1.frearCarro();
        p1.desligarCarro();
    }
}
