# java-exercise-simple

### Persistence

Si sviluppi la classe “Persistence” con funzione "calculate(int n)", che prenda un parametro intero positivo e
ritorna la sua “persistenza moltiplicativa”,
che è il numero di volte per cui bisogna moltiplicare le cifre fra loro fino ad avere un unico carattere.
Per esempio:

* ``Persistence.calculate(39) == 3`` perché 3*9 = 27, 2*7 = 14, 1*4=4 e 4 è di una cifra sola
* ``Persistence.calculate(999) == 4`` perché 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, e 1*2 = 2
* ``Persistence.calculate(4) == 0`` perché 4 è già una cifra singola

##### Suggerimenti

1. trovare un modo per separare le cifre di un numero
2. 39 = (3 * 10) + 9 e 999 = (9 * 100) + (9 * 10) + 9 
3. per trovare parte intera e/o decimale si puó usare la libreria Math
4. per calcolare la moltiplicazione recorsiva si puó usare stream

###### SPOILER

5. ``Math.floorMod(x,y) / Math.floorDiv(x,y)``
6. ``stream.reduce(1,(a, b) -> a * b )``

### RowSumOddNumbers

Dato il seguente triangolo di numeri dispari:

``` 
1
3    5
7    9   11
13   15  17  19
21   23  25  27  29
…
```

si sviluppi la classe “RowSumOddNumbers” con funzione "calculate(int n)", che calcola la somma dei numeri nella riga n-esima. Per esempio:

* ``RowSumOddNumbers.calculate(1) = 1``
* ``RowSumOddNumbers.calculate(3) = 7 + 9 + 11 = 27``

##### Suggerimenti

1. ogni valore del triangolo puó essere calcolato basandosi sulla posizione di colonna e riga
2. il primo valore di ogni riga si puó derivare basandosi sulla riga, i successivi sono incrementali di 2 

###### SPOILER

3. terza riga, prima colonna => 7 = (3 * 2) + 1
4. terza riga, terza colonna => 11 = (3 * 2) + 1 + 4
5. X riga, Y colonna = X * (X-1) + (Y - 1) * 2 + 1
