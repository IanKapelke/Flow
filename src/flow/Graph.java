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
    
    
    public Graph(int numVertices){
        this.vertexList = new ArrayList<>();      
        for(int i=0; i<numVertices; i++){
            this.vertexList.add(new Vertex(i));
        }
        
        this.adjacencyMatrix = new AdjacencyMatrix(numVertices);        
    }
        
    public void addEdge(Vertex source, Vertex destination){
        int sourceId = source.getId();
        int destinationId = destination.getId();
        this.adjacencyMatrix.setEntry(sourceId, destinationId, Boolean.TRUE);
    }
    
}
