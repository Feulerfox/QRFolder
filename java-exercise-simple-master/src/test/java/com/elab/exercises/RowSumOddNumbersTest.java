package com.elab.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**************
 * Dato il seguente triangolo di numeri dispari:
 * 1
 * 3    5
 * 7    9   11
 * 13   15  17  19
 * 21   23  25  27  29
 * ….
 * si sviluppi la classe “RowSumOddNumbers” con funzione "calculate(int n)", che calcola la somma dei numeri nella riga n-esima. Per esempio:
 *
 * - RowSumOddNumbers.calculate(1) = 1
 * - RowSumOddNumbers.calculate(3) = 7 + 9 + 11 = 27
 *
 */
public class RowSumOddNumbersTest {

    @Test
    public void testFirstRow(){
        assertEquals(RowSumOddNumbers.calculate(1), 1);
    }

    @Test
    public void testThirdRow(){
        assertEquals(RowSumOddNumbers.calculate(3), 27);
    }

}
