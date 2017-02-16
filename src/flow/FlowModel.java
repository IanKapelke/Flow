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
    Graph gameGraph;
    
    public FlowModel(){
        this.selectedColor = VertexColor.GREY;
        this.gameGraph = new Graph();
    }
    
    public void updateSelectedColor(VertexColor color){
        this.selectedColor = color;
    }
    
    
}
