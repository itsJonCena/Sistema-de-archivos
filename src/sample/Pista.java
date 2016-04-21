package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Alex on 21/04/16.
 */
public class Pista {

    private final StringProperty sector0;
    private final StringProperty sector1;
    private final StringProperty sector2;
    private final StringProperty sector3;
    private final StringProperty sector4;
    private final StringProperty sector5;
    private final StringProperty sector6;
    private final StringProperty sector7;

    public Pista(String sector0,String sector1,String sector2,String sector3,String sector4,String sector5,String sector6,String sector7) {
        this.sector0 = new SimpleStringProperty(sector0);
        this.sector1 = new SimpleStringProperty(sector1);
        this.sector2 = new SimpleStringProperty(sector2);
        this.sector3 = new SimpleStringProperty(sector3);
        this.sector4 = new SimpleStringProperty(sector4);
        this.sector5 = new SimpleStringProperty(sector5);
        this.sector6 = new SimpleStringProperty(sector6);
        this.sector7 = new SimpleStringProperty(sector7);
    }

    public Pista(String[] datos){
        this.sector0 = new SimpleStringProperty(datos[0]);
        this.sector1 = new SimpleStringProperty(datos[1]);
        this.sector2 = new SimpleStringProperty(datos[2]);
        this.sector3 = new SimpleStringProperty(datos[3]);
        this.sector4 = new SimpleStringProperty(datos[4]);
        this.sector5 = new SimpleStringProperty(datos[5]);
        this.sector6 = new SimpleStringProperty(datos[6]);
        this.sector7 = new SimpleStringProperty(datos[7]);
    }



    public String getSector0() {
        return sector0.get();
    }

    public StringProperty sector0Property() {
        return sector0;
    }

    public String getSector1() {
        return sector1.get();
    }

    public StringProperty sector1Property() {
        return sector1;
    }

    public String getSector2() {
        return sector2.get();
    }

    public StringProperty sector2Property() {
        return sector2;
    }

    public String getSector3() {
        return sector3.get();
    }

    public StringProperty sector3Property() {
        return sector3;
    }

    public String getSector4() {
        return sector4.get();
    }

    public StringProperty sector4Property() {
        return sector4;
    }

    public String getSector5() {
        return sector5.get();
    }

    public StringProperty sector5Property() {
        return sector5;
    }

    public String getSector6() {
        return sector6.get();
    }

    public StringProperty sector6Property() {
        return sector6;
    }

    public String getSector7() {
        return sector7.get();
    }

    public StringProperty sector7Property() {
        return sector7;
    }



}
