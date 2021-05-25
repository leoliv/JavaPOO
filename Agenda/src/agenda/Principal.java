package agenda;

public class Principal {
    public static void main(String[] args) {
        Agenda note1 = new Agenda();
        Agenda note2 = new Agenda();
        note1.Agenda(7, 9, "Independência do Brasil");
        note2.Agenda(9, 15, "Dia das Mães");
        note1.status();
        note2.status();
    }
}
