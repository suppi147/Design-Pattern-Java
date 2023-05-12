package DP.Iterator;
import DP.Iterator.Vertex.Vertex;

import java.lang.reflect.Array;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) {
         Vertex<Integer> v0= new Vertex<>(0);
         Vertex<Integer> v1= new Vertex<>(1);
         Vertex<Integer> v2= new Vertex<>(2);
         Vertex<Integer> v3= new Vertex<>(3);
         Vertex<Integer> v4= new Vertex<>(4);
         Vertex<Integer> v5= new Vertex<>(5);
         Vertex<Integer> v6= new Vertex<>(6);
         
         v0.SetNeigbor(Arrays.asList(v1,v5,v6));
         v1.SetNeigbor(Arrays.asList(v3,v4,v5));
         v4.SetNeigbor(Arrays.asList(v2,v6));
         v6.SetNeigbor(Arrays.asList(v0));

         DBFIretator<Integer> dfs= new DBFIretator<>(v0);
         dfs.GetNext();
         
    }
}
