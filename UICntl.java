/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesandbooks;

/**
 *
 * @author Jennifer
 */
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class UICntl {

    @FXML
    private AnchorPane searchButton;

    @FXML
    private TextField searchField;

    @FXML
    private Text titleField;

    @FXML
    private Text bookField;

    @FXML
    private Text movieField;
    
    @FXML 
    protected void handleSearchButtonAction(){
        String title = searchField.getText();
        titleField.setText(title);
        
    }

}

