package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private TableView<Pista> tableView;
    @FXML private Button archivo;

    @FXML TableColumn<Pista,String> column0;
    @FXML TableColumn<Pista,String> column1;
    @FXML TableColumn<Pista,String> column2;
    @FXML TableColumn<Pista,String> column3;
    @FXML TableColumn<Pista,String> column4;
    @FXML TableColumn<Pista,String> column5;
    @FXML TableColumn<Pista,String> column6;
    @FXML TableColumn<Pista,String> column7;

    @FXML Label labeSize_Disk;
    @FXML Label labeSector_Size;
    @FXML Label labeMax_Sectors;
    @FXML Label labeMAx_pistas;


    private final ObservableList strings = FXCollections.observableArrayList("1","2","4","8");

    // en Bytes
    // 16777216 / 512 = 32,768
    // 32768 / 8 = numero maximo de clusters

    static double SIZE_DISK = 4096000;
    static double SECTOR_SIZE = 512;
    static double MAX_SETORS = 8000;
    static int MAX_PISTAS = 64;

    NFile disk[][] = new NFile[1000][8];
    private ObservableList<Pista> Datas = FXCollections.observableArrayList();


    @FXML public void crearArchivo() {
        String nombrearchivo = "";
        double tamaarchivo = 0;


        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Crear Archivo");
        dialog.setHeaderText("Creacion del Archivo");
        dialog.setContentText("Ingresa el datos del archivo");


// Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        dialog.setContentText("Ingresa el tamaño del archivo");
        Optional<String> tama = dialog.showAndWait();
        if (result.isPresent() && tama.isPresent()) {
            nombrearchivo = result.get();
            //String a = tama.get();
            tamaarchivo = Double.parseDouble(tama.get());
        } else {
            System.out.println("No se creo Archivo");
        }


        for (int f = 1; f < 1000; f++) {
            for (int c = 0; c < 8; c++) {
                if (disk[f][c] == null) {
                    NFile nuevo = new NFile(nombrearchivo, tamaarchivo);

                    //disk[f][c] = new NFile(nombrearchivo, tamaarchivo);
                    double dv = (nuevo.getTamaarchivo()*1000)/512;
                    if (isdigit(dv)) {
                        for (int a = f; a < 1000; a++){
                            for (int b = c; b < 8; b++){
                                if (disk[a][b] == null){

                                    if (dv >0){
                                        disk[a][b] = nuevo;
                                        dv = dv-1;
                                    }else {
                                        updateTable();
                                        return;
                                    }
                                }
                            }
                        }

                    }
                    return;

                }

            }


        }
    }

    @FXML private void borrarArchivo(){
        String nombrearchivo = "";


        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Crear Archivo");
        dialog.setHeaderText("Creacion del Archivo");
        dialog.setContentText("Ingresa el datos del archivo");


// Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            nombrearchivo = result.get();

        }

        for (int fila =1; fila < 1000; fila++){
            for (int columna =0; columna < 8; columna++){
                if (disk[fila][columna] != null){
                    if (disk[fila][columna].getNomarchivo().compareTo(nombrearchivo) == 0){
                        disk[fila][columna] = null;
                    }
                }

            }
        }
        updateTable();

    }



    /*
    @FXML public void verarchivo() throws IOException {
        final Stage stage;
        stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("VentanaArchivo.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    */

    public boolean isdigit(Double dig){

        int d = (int) Math.floor(dig);

        if(dig > d){
            return true;
        }else if(dig == d){
            return false;
        }

            return false;


    }

    private void updateTable(){
        if (Datas.size() > 0){
            Datas.removeAll(Datas);
            tableView.setItems(Datas);
        }

        String aux[] = new  String[8];

        for (int fila =0; fila < 1000; fila++){
            for (int columna =0; columna < 8; columna++){
                if (disk[fila][columna] != null){
                    aux[columna] = disk[fila][columna].getNomarchivo();
                }else {
                    aux[columna] = null;
                }
            }
            Datas.add(new Pista(aux));
        }

        column0.setCellValueFactory(cellData -> cellData.getValue().sector0Property());
        column1.setCellValueFactory(cellData -> cellData.getValue().sector1Property());
        column2.setCellValueFactory(cellData -> cellData.getValue().sector2Property());
        column3.setCellValueFactory(cellData -> cellData.getValue().sector3Property());
        column4.setCellValueFactory(cellData -> cellData.getValue().sector4Property());
        column5.setCellValueFactory(cellData -> cellData.getValue().sector5Property());
        column6.setCellValueFactory(cellData -> cellData.getValue().sector6Property());
        column7.setCellValueFactory(cellData -> cellData.getValue().sector7Property());

        tableView.setItems(Datas);
    }



    @Override
    public void initialize(URL arg, ResourceBundle rb) {
        labeSize_Disk.setText(""+SIZE_DISK +" Bytes");
        labeSector_Size.setText(""+SECTOR_SIZE+" Bytes");
        labeMax_Sectors.setText(""+MAX_SETORS);
        labeMAx_pistas.setText(""+MAX_PISTAS);
        /*
        disk[0][0] = new NFile("file0",2);
        disk[0][1] = new NFile("file1",2);
        disk[0][2] = new NFile("file2",2);
        disk[0][3] = new NFile("file3",3);
        disk[0][4] = new NFile("file4",2);
        disk[0][5] = new NFile("file5",2);
        disk[0][6] = new NFile("file6",2);
        disk[0][7] = new NFile("file7",2);


        Datas.add(new Pista(disk[0][0].getNomarchivo(),
                disk[0][1].getNomarchivo(),
                disk[0][2].getNomarchivo(),
                disk[0][3].getNomarchivo(),
                disk[0][4].getNomarchivo(),
                disk[0][5].getNomarchivo(),
                disk[0][6].getNomarchivo(),
                disk[0][7].getNomarchivo()));

        column0.setCellValueFactory(cellData -> cellData.getValue().sector0Property());
        column1.setCellValueFactory(cellData -> cellData.getValue().sector1Property());
        column2.setCellValueFactory(cellData -> cellData.getValue().sector2Property());
        column3.setCellValueFactory(cellData -> cellData.getValue().sector3Property());
        column4.setCellValueFactory(cellData -> cellData.getValue().sector4Property());
        column5.setCellValueFactory(cellData -> cellData.getValue().sector5Property());
        column6.setCellValueFactory(cellData -> cellData.getValue().sector6Property());
        column7.setCellValueFactory(cellData -> cellData.getValue().sector7Property());

        tableView.setItems(Datas);
        updateTable();
        */
    }

}