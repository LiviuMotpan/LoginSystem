public class Main {
    public static void main(String[] args) {

        IDandPassword IDandPassword = new IDandPassword();

        LoginPage loginPage = new LoginPage(IDandPassword.getLoginInfo());

    }
}