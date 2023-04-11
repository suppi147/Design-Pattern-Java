package DP.Chain_of_Responsibility.Middleware;

public class RoleCheckMiddleware extends Middleware {

    public RoleCheckMiddleware(){}

    public boolean Check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return CheckNext(email, password);
    }
}
