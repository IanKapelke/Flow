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
public class FlowModel {
   
    private VertexColor selectedColor;
    private final Graph gameGraph;
    
    public FlowModel(){
        this.selectedColor = VertexColor.GREY;
        this.gameGraph = new Graph();
       
        
        Vertex source = new Vertex(0, VertexColor.GREEN);
        Vertex destination = new Vertex(1, VertexColor.RED);
        Vertex other = new Vertex(2);
        
        this.gameGraph.addVertex(source);
        this.gameGraph.addVertex(destination);
        this.gameGraph.addVertex(other);
        
        this.gameGraph.addEdge(0, 1);
    }
    
    public void setSelectedColor(VertexColor color){
        this.selectedColor = color;
    }
    
    public VertexColor getSelectedColor(){
        return this.selectedColor;
    }
        
}
