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
    private final int id;
    
    public Vertex(int id){
        this.id = id;
        this.isMutable = true;
        this.color = VertexColor.GREY;
    }
    
    public Vertex(int id, VertexColor color){
        this.id = id;
        this.isMutable = false;
        this.color = color;
    }
    
    public void setColor(VertexColor color){
        this.color = color;
    }
    
    public VertexColor getColor(){
        return this.color;
    }
    
    public int getId(){
        return this.id;
    }
}
