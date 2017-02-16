/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;



/**
 *
 * @author ian
 */
public class FlowController implements Initializable {
    
    @FXML private GridPane gridpane;
    @FXML private Rectangle colorIndicator;
    
    private FlowModel model;
    
    
    /*
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.model = new FlowModel();
        
       
        Rectangle redRectangle = new Rectangle(0, 0, 50, 50);
        redRectangle.setFill(Color.RED);
        
        Rectangle greenRectangle = new Rectangle(0, 0, 50, 50);
        greenRectangle.setFill(Color.GREEN);
        
        gridpane.add(redRectangle, 1, 1);
        gridpane.add(greenRectangle, 2, 2);

    }    
    
}
