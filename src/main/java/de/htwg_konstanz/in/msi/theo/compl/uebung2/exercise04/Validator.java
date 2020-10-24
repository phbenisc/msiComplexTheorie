package de.htwg_konstanz.in.msi.theo.compl.uebung2.exercise04;

public class Validator {
    void evaluateAndPrint(String tel) {
        String result = isKnTelNr(tel) ? "Konstanzer Telefonnummer" : "keine Konstanzer Telefonnummer";
        System.out.println(result);
    }

    boolean isKnTelNr(String tel) {
        return tel.matches("\\+497531\\d{3,}");
    }
}
