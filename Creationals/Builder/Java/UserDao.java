package Creationals.Builder.Java;

public class UserDao {

    private final String firstName;
    private final String lastName;
    private final int phone;
    private final String email;
    private final String password;

    public UserDao(builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class builder {

        private  String firstName;
        private  String lastName;
        private  int phone;
        private  String email;
        private  String password;

        public String getFirstName() {
            return firstName;
        }

        public builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;

        }

        public builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public int getPhone() {
            return phone;
        }

        public builder setPhone(int phone) {
            this.phone = phone;
            return this;

        }

        public String getEmail() {
            return email;

        }

        public builder setEmail(String email) {
            this.email = email;
            return this;

        }

        public String getPassword() {
            return password;
        }

        public builder setPassword(String password) {
            this.password = password;
            return this;

        }

        public UserDao build(){
            return new UserDao(this);
        }
    }



}
