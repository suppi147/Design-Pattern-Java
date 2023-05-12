package DP.Iterator;

import java.util.Deque;
import java.util.LinkedList;

import DP.Iterator.Vertex.Vertex;


public class DBFIretator<T> implements Iretator{
    Vertex<T> startVertex;
    Deque<Vertex<T>> stack=new LinkedList<>();
    public DBFIretator(Vertex<T> startVertex){
        this.startVertex=startVertex;
        stack.push(startVertex);
    }
    
    @Override
    public boolean HasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex GetNext() {
        if(!HasNext()){
            return null;
        }
        Vertex<T> current=stack.pop();
        if(!current.IsVisited()){
            current.SetVisited(true);
            System.out.println(current.GetData());

           current.GetNeigbor().forEach(stack::push);
        }
        return GetNext();
    }
    @Override
    public void Reset() {
        stack.clear();
        stack.push(startVertex);
    }
}
