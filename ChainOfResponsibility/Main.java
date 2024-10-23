import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    // public static BufferedReader reader = new BufferedReader(new
    // InputStreamReader(System.in));

    private static Server server;

    public static void main(String[] args) throws IOException {

        init();
        Scanner sc = new Scanner(System.in);

        boolean success = false;
        do {
            System.out.println("Enter email:");
            String email = sc.nextLine();
            System.out.println("Enter password:");
            String password = sc.nextLine();
            success = server.logIn(email, password);

        } while (!success);
        sc.close();

    }

    public static void init() {
        server = new Server();
        server.register("admin@example.com", "admin@pass");
        server.register("user@example.com", "user@pass");

        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2), new UserExistsMiddleware(server),
                new RoleCheckMiddleware());

        server.setMiddleware(middleware);

    }

}
