package sobrescrita;

public class Cachorro extends Animal {
    public void comunicar() {
        super.comunicar();
        System.out.println("Au, au!");
    }
}
