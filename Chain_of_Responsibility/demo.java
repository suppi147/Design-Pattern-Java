package DP.Chain_of_Responsibility;

import java.io.*;

import DP.Chain_of_Responsibility.Middleware.Middleware;
import DP.Chain_of_Responsibility.Middleware.PasswordExpMiddleware;
import DP.Chain_of_Responsibility.Middleware.RoleCheckMiddleware;
import DP.Chain_of_Responsibility.Middleware.ThrottlingMiddleware;
import DP.Chain_of_Responsibility.Middleware.UserExistsMiddleware;

public class demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // EN: All checks are linked. Client can build various chains using the
        // same components.
        //
        // RU: Проверки связаны в одну цепь. Клиент может строить различные
        // цепи, используя одни и те же компоненты.
        Middleware middleware = Middleware.Link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new PasswordExpMiddleware(true, server),
            new RoleCheckMiddleware()
        );

        // EN: Server gets a chain from client code.
        //
        // RU: Сервер получает цепочку от клиентского кода.
        server.SetMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
