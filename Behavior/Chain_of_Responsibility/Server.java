package DP.Chain_of_Responsibility;

import java.util.*;

import DP.Chain_of_Responsibility.Middleware.Middleware;

public class Server {
    private Map<String,String> users= new HashMap<>();
    private Middleware middleware;

    public void SetMiddleware(Middleware middleware){
        this.middleware=middleware;
    }

    public boolean logIn(String email,String password){
        if(middleware.Check(email, password)){
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }


    public void register(String email,String password){
        users.put(email, password);
    }

    public boolean HasEmail(String email){
        return users.containsKey(email);
    }

    public boolean IsValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
}
