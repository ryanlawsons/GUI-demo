package gui.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author ryanl
 */
public class FXMLDocumentController implements Initializable {
    
    // These are for the CheckBox example
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    // These are for the ChoiceBox example
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    // These are for the ComboBox example
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    // This will update the Label for the ChoiceBox
    public void choiceBoxButtonPushed()
    {
        choiceBoxLabel.setText("My favorite fruit is:\n"+choiceBox.getValue().toString());
    }
    
    // This is for the CheckBox example
    public void pizzaOrderButtonPushed()
    {
        String order = "Toppings are:";
        
        if (pineappleCheckBox.isSelected())
            order += "\npineapple";
        
        if (pepperoniCheckBox.isSelected())
            order += "\npepperoni";
        
        if (baconCheckBox.isSelected())
            order += "\nbacon";
        
        this.pizzaOrderLabel.setText(order);
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pizzaOrderLabel.setText("");
        
        // This is for configuring the ChoicBox
        choiceBoxLabel.setText("");
        choiceBox.getItems().addAll("apples","pears","oranges","strawberries","bananas");
        choiceBox.setValue("apples");
        
        // This configures the ComboBox
        comboBox.getItems().addAll("COMP1030","COMP1008","MGMT2003","MGMT2010");
        
    }    
    
}
