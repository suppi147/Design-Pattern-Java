package DP.Singleton;

public class demo{
    public static void main(String [] args){
        //single thread tested
        Singleton_file test=Singleton_file.GetInstance("d.cpp");
        Singleton_file test2=Singleton_file.GetInstance("kkk.cpp");
        System.out.println(test.filename);
        System.out.println(test2.filename);
    }
    
}
