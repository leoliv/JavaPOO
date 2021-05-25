package Atividade2;

public class Main {
    public static void main(String[] args) {
        CelularMae c1 = new CelularMae(true, 33912203);
        c1.telaCelularMae();
        System.out.println("----------------------------------");
        CelularModerno c2 = new CelularModerno(false, 33912216);
        c2.telaCelularMae();
        System.out.println("----------------------------------");
        CelularAndroid c3 = new CelularAndroid(true, 998335620, "Arvore", "IMD", "TikTok", "Minecraft", "Nubank");
        c3.telaCelularAndroid();
    }
}
