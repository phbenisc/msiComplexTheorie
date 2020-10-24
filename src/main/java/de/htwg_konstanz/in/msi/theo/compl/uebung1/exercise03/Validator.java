package de.htwg_konstanz.in.msi.theo.compl.uebung1.exercise03;

import java.util.stream.Stream;

public class Validator {
    void evaluateAndPrint(String bin) {
        String result = isBinWord(bin) ? "gültiges Wort" : "ungültiges Wort";
        System.out.println(result);
    }

    boolean isBinWord(String bin) {
        boolean onlyAlphabetSymbols = bin.codePoints()
                .allMatch(value ->
                        Stream.of("0", "1")
                                .mapToInt(value1 -> value1.codePointAt(0))
                                .anyMatch(value1 -> value == value1)
                );

        boolean geMinLength = bin.length() >= 4;

        return onlyAlphabetSymbols && geMinLength;
    }
}
