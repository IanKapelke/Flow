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
    
    public AdjacencyMatrix(int dimensions){
        this.matrix = new ArrayList<>();
         
        for(int i=0; i<dimensions; i++){
            ArrayList<Boolean> column = new ArrayList<>();
            
            for(int j=0; j<dimensions; j++){
                column.add(Boolean.FALSE);
            }
            this.matrix.add(column);
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
