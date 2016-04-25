package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Jesus on 21/04/2016.
 */
public class NFile {
    String nomarchivo;

    double tamaarchivo;

    String fecha;


    //private final StringProperty nombreArchivo;
    //private final StringProperty tamañoArchio;

    public NFile(String nomarchivo , double tamaarchivo , String fecha){
        //nombreArchivo = new SimpleStringProperty(nomarchivo);
        //tamañoArchio = new SimpleStringProperty(""+tamaarchivo);
        this.nomarchivo = nomarchivo;
        this.tamaarchivo = tamaarchivo;
        this.fecha = fecha;
    }


    public String getNomarchivo() {
        return nomarchivo;
    }


    public void setNomarchivo(String nomarchivo) {
        this.nomarchivo = nomarchivo;
    }

    public double getTamaarchivo() {
        return tamaarchivo;
    }

    public void setTamaarchivo(double tamaarchivo) {
        this.tamaarchivo = tamaarchivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
