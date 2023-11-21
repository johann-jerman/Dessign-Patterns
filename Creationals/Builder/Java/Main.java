package Creationals.Builder.Java;

public class Main {
    public static void main(String[] args) {
        UserDao user = new UserDao.builder()
                .setPhone(123)
                .setFirstName("juan")
                .setEmail("juan@email.com")
                .setLastName("juan")
                .setPassword("123")
                .build();
    }
}
