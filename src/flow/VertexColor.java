/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

import javafx.scene.paint.Color;
/**
 *
 * @author ian
 */
public enum VertexColor {
    GREY(Color.GREY), RED(Color.RED), GREEN(Color.GREEN);
    
    private final Color paintColor;
    
    private VertexColor(Color paintColor){
        this.paintColor = paintColor;
    }
    
    public Color getPaintColor(){
        return this.paintColor;
    }
    
}
