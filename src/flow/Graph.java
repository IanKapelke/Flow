/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

import java.util.*;

/**
 *
 * @author ian
 */
public class Graph {
    private final ArrayList<Vertex> vertexList;
    private final ArrayList<ArrayList<Boolean>> adjacencyMatrix;
    
    
    public Graph(){
        this.vertexList = new ArrayList<>();
        this.adjacencyMatrix = new ArrayList<>();
    }
    
    public void addVertex(Vertex vertex){
        this.vertexList.add(vertex);
    }
    
    public void addEdge(Vertex source, Vertex destination){
        this.adjacencyMatrix.get(source.getId()).add(destination.getId(),true);
        this.adjacencyMatrix.get(destination.getId()).add(source.getId(),true);
    }
    
}
