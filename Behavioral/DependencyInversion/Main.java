package Behavioral.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new PostgreRepository();
        UserService service = new UserService(userRepository);
    }
}
