package DP.Chain_of_Responsibility.Middleware;

import DP.Chain_of_Responsibility.Server;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean Check(String email, String password) {
        if (!server.HasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.IsValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return CheckNext(email, password);
    }
}
