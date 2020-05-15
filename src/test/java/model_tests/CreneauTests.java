package model_tests;

import fr.esgi.model.Creneau;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CreneauTests {

    @Test
    void should_contain_or_not() {
        Creneau creneau = new Creneau("20/05/15", 10, 20);
        Creneau creneau2 = new Creneau("20/05/15", 14, 15);

        assertTrue(creneau.contient(creneau2));
        assertFalse(creneau2.contient(creneau));
    }
}
