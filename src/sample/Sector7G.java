package sample;

/**
 * Created by Alex on 20/04/16.
 */
public class Sector7G {
    String nombre;
    String fecha;
    int tamano;


    public Sector7G(String nombre ,String fecha , int tamano){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamano = tamano;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

}
