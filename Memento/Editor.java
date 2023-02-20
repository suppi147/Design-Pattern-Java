package DP.Memento;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import DP.Memento.TextArea.Memento;

public class Editor {
    private Deque<Memento> stateHistory;
    private TextArea textArea;
    
    public Editor(){
        stateHistory=new LinkedList<>();
        textArea=new TextArea();
    }

    public void Write(String text){
        textArea.SetText(text);
        stateHistory.add(textArea.TakeSnapshot());
    }

    public void Show(){
        System.out.print(textArea.GetText()); 
    }

    public void Undo(){
        textArea.Restore(stateHistory.pop());
    }
}
