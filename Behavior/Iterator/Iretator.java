package DP.Iterator;

import DP.Iterator.Vertex.Vertex;

public interface Iretator<T> {
    boolean HasNext();
    Vertex<T> GetNext();
    void Reset();    
}
