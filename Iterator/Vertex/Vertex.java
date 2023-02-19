package DP.Iterator.Vertex;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private T data; 
    private boolean visited;
    private List<Vertex<T>> neighbor=new ArrayList<>();

    public Vertex(T x){
        this.data=x;
    }

    public T GetData(){
        return data;
    }

    public boolean IsVisited(){
        return this.visited;
    }

    public void SetVisited(Boolean visited){
        this.visited=visited;
    }

    public List<Vertex<T>> GetNeigbor(){
        return this.neighbor;
    }

    public void SetNeigbor(List<Vertex<T>> test){
        this.neighbor=test;
    }
}
