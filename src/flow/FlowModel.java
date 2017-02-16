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
    private Graph gameGraph;
    
    public FlowModel(){
        this.selectedColor = VertexColor.GREY;
        this.gameGraph = new Graph(2);
        
        Vertex source = new Vertex(0);
        Vertex destination = new Vertex(1);
        
        this.gameGraph.addEdge(source, destination);
    }
    
    public void updateSelectedColor(VertexColor color){
        this.selectedColor = color;
    }
        
}
