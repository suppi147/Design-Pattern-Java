package DP.Memento;

public class demo {
    public static void main(String[] args) {
        Editor editor=new Editor();
        editor.Write("Hi meos");
        editor.Write("Hi cat");
        editor.Write("Hi me");
        editor.Write("Hi dogggggie");
        editor.Undo();
        editor.Undo();
        editor.Show();       
    }
}
