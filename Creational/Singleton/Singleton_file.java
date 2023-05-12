package DP.Singleton;

public class Singleton_file {
    private static Singleton_file instance;
    public String filename;

    private Singleton_file(String filname){
        this.filename=filname;
    }

    public static Singleton_file GetInstance(String filename){
        if(instance==null)
            instance= new Singleton_file(filename);
        return instance;
    }
    
}
