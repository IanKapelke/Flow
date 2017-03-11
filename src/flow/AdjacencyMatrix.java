/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class AdjacencyMatrix {
    private final ArrayList<ArrayList<Boolean>> matrix;
    
    public AdjacencyMatrix(){
        this.matrix = new ArrayList<>();
    }
    
    public void incrementDimensions(){
        ArrayList<Boolean> newColumn = new ArrayList<>();
        for(int i=0; i<this.matrix.size(); i++){
            newColumn.add(Boolean.FALSE);
        }
        this.matrix.add(newColumn);
        
        for(ArrayList<Boolean> column : this.matrix){
            column.add(Boolean.FALSE);
        }     
    }
    
    public void setEntry(int column, int row, Boolean entry){
        this.matrix.get(column).set(row, entry);
    }
    
    public Boolean getEntry(int column, int row){
        Boolean entry = this.matrix.get(column).get(row);
        return entry;
    }
    
}
