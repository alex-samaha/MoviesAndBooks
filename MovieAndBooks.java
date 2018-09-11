/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesandbooks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jennifer
 */
public class MoviesAndBooks extends Application {

    /**
     * @param args the command line arguments
     */
     @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(MoviesAndBooks.class.getResource("UI.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Movies and Books");
        stage.show();
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
        
    }
    
}
