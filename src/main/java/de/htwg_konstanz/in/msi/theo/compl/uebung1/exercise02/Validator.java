package de.htwg_konstanz.in.msi.theo.compl.uebung1.exercise02;

import java.util.List;

public class Validator {
    void evaluateAndPrint(String plz) {
        String result = isPostalCodeLocatedInKn(plz) ? "Konstanzer PLZ" : "keine Konstanzer PLZ";
        System.out.println(result);
    }

    boolean isPostalCodeLocatedInKn(String plz) {
        return List.of("78462", "78464", "78465", "78467").contains(plz);
    }
}
