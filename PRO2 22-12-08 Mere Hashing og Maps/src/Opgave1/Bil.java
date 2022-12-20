package Opgave1;

import java.util.Objects;

public class Bil {
    //Fields ---------------------------------------------------------------------------------------------------------
    private String regNr;
    private String maerke;
    private String model;
    private String farve;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Bil(String regNr, String maerke, String model, String farve) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }


    //Methods - Other ------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return farve + " " + maerke + " - " + model + " (" + regNr + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNr, maerke);
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this.hashCode() == o.hashCode()) {
            result = true;
        }
        return result;
    }
}


