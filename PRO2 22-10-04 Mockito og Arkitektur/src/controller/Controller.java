package controller;

import ordination.*;
import storage.*;

public class Controller {
    private StorageInterface storage;
    private static Controller controller;

    private Controller(StorageInterface storage) {
        this.storage = storage;
    }

    public static Controller getController(StorageInterface storage) {
        if (controller == null) {
            controller = new Controller(storage);
        }
        return controller;
    }

    /**
     * For et givent vægtinterval og et givent lægemiddel, hentes antallet af
     * ordinationer.
     * Pre: laegemiddel er ikke null
     */
    public int antalOrdinationerPrVægtPrLægemiddel(double vægtStart, double vægtSlut, Laegemiddel laegemiddel) {
        int antal = 0;
        for (Patient patient : storage.getAllPatienter()) {
            if (patient.getVaegt() >= vægtStart && patient.getVaegt() <= vægtSlut) {
                for (Ordination ordination : patient.getOrdinationer()) {
                    if (ordination.getLaegemiddel().equals(laegemiddel)) {
                        antal++;
                    }
                }
            }
        }
        return antal;
    }
}
