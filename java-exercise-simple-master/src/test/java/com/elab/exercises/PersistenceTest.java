package com.elab.exercises;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/*********
 * Si sviluppi la classe “Persistence” con funzione "calculate(int n)", che prenda un parametro intero positivo e
 * ritorna la sua “persistenza moltiplicativa”,
 * che è il numero di volte per cui bisogna moltiplicare le cifre fra loro fino ad avere un unico carattere.
 * Per esempio:
 *
 * •	Persistence.calculate(39) == 3 perché 3*9 = 27, 2*7 = 14, 1*4=4 e 4 è di una cifra sola
 * •	Persistence.calculate(999) == 4 perché 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, e 1*2 = 2
 * •	Persistence.calculate(4) == 0 perché 4 è già una cifra singola
 */
public class PersistenceTest {

    @Test
    public void testCase4() {
        assertEquals(Persistence.calculate(4), 0);
    }

    @Test
    public void testCase39() {
        assertEquals(Persistence.calculate(39), 3);
    }

    @Test
    public void testCase999() {
        assertEquals(Persistence.calculate(999), 4);
    }

}
