package arraylist2;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();

        Funcionarios f1 = new Funcionarios("Mário", 23, "Administração");
        Funcionarios f2 = new Funcionarios("Rodrigo", 26, "Administração");

        funcionarios.add(f1);
        funcionarios.add(f2);

        for (Funcionarios funcionario : funcionarios) {
            System.out.println("----------------------");
            System.out.println(funcionario.descricao());
        }
        System.out.println("----------------------");
        
        
        
        /* clientes.add("Aline");
        clientes.add("Angela");
        clientes.add("Pedro");
        clientes.add("Goku");
        // clientes.remove(2);
        // clientes.clear();
        // System.out.println(clientes.indexOf("Aline"));
        // System.out.println(clientes.size());
        System.out.println(clientes.toString()); */
    }
}
