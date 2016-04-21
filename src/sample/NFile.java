package sample;

/**
 * Created by Jesus on 21/04/2016.
 */
public class NFile {
    String nomarchivo;
    String tamaarchivo;

    public NFile(String nomarchivo , String tamaarchivo){
        this.nomarchivo = nomarchivo;
        this.tamaarchivo = tamaarchivo;
    }


    public String getNomarchivo() {
        return nomarchivo;
    }

    public String getTamaarchivo() {
        return tamaarchivo;
    }

    public void setNomarchivo(String nomarchivo) {
        this.nomarchivo = nomarchivo;
    }

    public void setTamaarchivo(String tamaarchivo) {
        this.tamaarchivo = tamaarchivo;
    }

}
