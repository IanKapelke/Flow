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
    private final AdjacencyMatrix adjacencyMatrix;
    
    
    public Graph(){
        this.vertexList = new ArrayList<>();              
        this.adjacencyMatrix = new AdjacencyMatrix();        
    }
        
    public void addVertex(Vertex vertex){
        this.vertexList.add(vertex);
        this.adjacencyMatrix.incrementDimensions();
    }
    
    public void addEdge(int sourceId, int destinationId){
        this.adjacencyMatrix.setEntry(sourceId, destinationId, Boolean.TRUE);
    }
    
}
