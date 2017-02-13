/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

/**
 *
 * @author ian
 */
public class Vertex {
    private final boolean isMutable;
    private VertexColor color;
    private final int xPosition;
    private final int yPosition;
    
    public Vertex(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isMutable = true;
        this.color = VertexColor.GREY;
    }
    
    public Vertex(int xPosition, int yPosition, VertexColor color){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isMutable = false;
        this.color = color;
    }
    
    public void setColor(VertexColor color){
        this.color = color;
    }
    
    public VertexColor getColor(){
        return this.color;
    }
    
    public int getXPosition(){
        return this.xPosition;
    }
    
    public int getYPosition(){
        return this.yPosition;
    }
}
