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
    
    
    public Graph(int numVertices){
        this.vertexList = new ArrayList<>();
      
        for(int i=0; i<numVertices;i++){
            this.vertexList.add(new Vertex(i));
        }
        
        this.adjacencyMatrix = new ArrayList<>();
        for(int i=0;i<numVertices;i++){
            ArrayList<Boolean> column = new ArrayList<>();
            for(int j=0; j<numVertices;j++){
                column.add(false);
            }
            this.adjacencyMatrix.add(column);
        }
        
    }
        
    public void addEdge(Vertex source, Vertex destination){
        this.adjacencyMatrix.get(source.getId()).add(destination.getId(),true);
        this.adjacencyMatrix.get(destination.getId()).add(source.getId(),true);
    }
    
}
