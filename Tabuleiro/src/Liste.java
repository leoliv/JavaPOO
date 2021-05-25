import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        int i = 0 
        while (i < 10 ) {
            User actual = new User("Nome " + i, "Sobrenome " + i);
            users.add(actual);
            i++;
        }
    }
}
