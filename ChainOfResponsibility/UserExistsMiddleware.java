public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered");
            return false;
        }
        if (!server.isValidPassword(email,password)) {
            System.out.println("Invalid password");

        }
        return checkNext(email, password);
    }

}
