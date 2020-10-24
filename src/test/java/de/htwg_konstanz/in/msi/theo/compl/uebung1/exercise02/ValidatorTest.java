package de.htwg_konstanz.in.msi.theo.compl.uebung1.exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    Validator sut = new Validator();

    @Test
    void isPostalCodeLocatedInKn(){
        assertFalse(sut.isPostalCodeLocatedInKn("11111"));
        assertTrue(sut.isPostalCodeLocatedInKn("78465"));
    }
}
