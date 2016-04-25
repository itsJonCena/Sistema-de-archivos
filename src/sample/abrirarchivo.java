package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * Created by Jesus on 21/04/2016.
 */



public class abrirarchivo implements Initializable {

    @FXML
    public static TreeItem root = new TreeItem<String>("Files") ;
    @FXML
    public static TreeView<NFile> Files = new TreeView<>(root) ;

    @FXML
    public void ShowInfoFile(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informacion");
        alert.setHeaderText("Information Alert");
        String s = "";
        alert.setContentText(s);
        alert.show();



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        root.setExpanded(true);

// Create the Root TreeItem



// Add children to the root
// Set the Root Node



    }
}
