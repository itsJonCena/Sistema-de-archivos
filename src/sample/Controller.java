package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private TableView<String> tableView;
    @FXML private TableColumn<String,Sector7G> columnSector;
    @FXML private TableColumn<String,Sector7G> columnContenido;
    @FXML ComboBox<String> combSector;
    @FXML ComboBox<String> combCluster;

    private final ObservableList strings = FXCollections.observableArrayList(
            "1","2","4","8");
    private final ObservableList strings2 = FXCollections.observableArrayList(
            "16","32","64","128","512");

    // en Bytes
    final double SIZE_DISK = 128000000;

    @FXML
    public void formatear(){
        int clusterSize = Integer.parseInt(combCluster.getSelectionModel().getSelectedItem());
        int sectorSize = Integer.parseInt(combSector.getSelectionModel().getSelectedItem());

        // en KB
        double bytesPorCluster = clusterSize * sectorSize;
        

        crearTabla();
    }

    private void crearTabla(){
        Sector7G disk[][] = new Sector7G[1000][1000];

    }

    @FXML public void creararchivo(){


    }



    @Override
    public void initialize(URL arg, ResourceBundle rb) {

        combCluster.setItems(strings);
        combCluster.setPromptText("Tamaño del Cluster");

        combSector.setItems(strings2);
        combSector.setPromptText("Tamaño del sector");
    }

}