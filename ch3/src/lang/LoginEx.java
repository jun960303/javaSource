package lang;

public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (NotExistIDExcetpion | WrongPasswordExcetpion e) {
            e.printStackTrace();
        }

    }

    public static void login(String id, String password) {
        // id가 blue 가 아니라면 NotExistIDExcetpion 발생

        // password 가 "12345"가 아니라면 WrongPasswordExcetpion 발생
    }
}
