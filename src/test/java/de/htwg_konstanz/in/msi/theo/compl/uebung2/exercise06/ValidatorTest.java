package de.htwg_konstanz.in.msi.theo.compl.uebung2.exercise06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "1,true",
            "10,true",
            "110,true",
            "110101010,true",
            "0,false",
            "11,false",
            "101,false",
    })
    void testPartOfLanguage(String word, boolean result) {
        assertEquals(result, word.matches("1.*0|1"));
    }
}
