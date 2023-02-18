package DP.Chain_of_Responsibility.Middleware;

import java.io.*;

import DP.Chain_of_Responsibility.Server;

public class PasswordExpMiddleware extends Middleware {
    boolean time2Change;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Server server;


    public PasswordExpMiddleware(boolean time2Change,Server server){
        this.time2Change=time2Change;
        this.server=server;
    }

    public boolean Check(String email, String password){
        if(this.time2Change){
            System.out.println("time to change password");
            System.out.print("Input password: ");
            String newPassword="";
            try {
                newPassword = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            server.register(email, newPassword);
            
            System.out.println("password changed");
            return true;
        }
        else
        {
            System.out.println("Password still in valid time");
        }
        return CheckNext(email, password);
    }
}
