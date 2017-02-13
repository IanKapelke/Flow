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
   
    VertexColor selectedColor;
    ArrayList<ArrayList<Vertex>> gameGraph;
    
    public FlowModel(int dimension){
        this.selectedColor = VertexColor.GREY;
        this.gameGraph = new ArrayList<>();
        
        for(int i=0; i<dimension; i++){
            ArrayList<Vertex> column = new ArrayList<>();
            
            for(int j=0;j<dimension; j++){
                Vertex vertex = new Vertex(i, j);
                column.add(vertex);
            }
            gameGraph.add(column);
        }
    }
    
    public void updateSelectedColor(VertexColor color){
        this.selectedColor = color;
    }
    
    
}
