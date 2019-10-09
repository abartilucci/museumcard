**Purposes** : project of a written test for the exam of Programming Methodologies of University of Florence Computer Science graduate course.

**Context:** ticket selling behaviour for the entrance to Museums considering promotions and discounts.

# Esercizio 1

Lo studente progetti e implementi il tipo di dato **MusCard**(Museum-Card), con 3 tipologie specifiche di Carte: 
**Student**, **Tourist**, **Business** (ossia, Carte per Studenti, per Turisti, per Aziende).

**(A)**

Ogni tipo di Card offre le seguenti funzionalità:

  - Il metodo **getCost** che restituisce (in un valore double) il costo della Carta su cui è invocato;
  - Una riscrittura del metodo **equals** per confrontare due Carte secondo la seguente definizione di uguaglianza: 
        - Due MusCard sono uguali se sono della stessa tipologia (indipendentemente da eventuali promozioni aggiuntive) e hanno     lo stesso proprietario 
        - In tutti gli altri casi il risultato del confronto è false.

_Caratteristiche specifiche di Student, Turist, Business:_

1. Ogni Carta **Student** ha un **name** (stringa), che rappresenta il nome del proprietario, ed un **monthCost** (di tipo double) che rappresenta il costo; questi valori sono passati al costruttore.

2. Ogni Carta **Tourist** ha un ha un **name** (stringa), che rappresenta il nome del proprietario, ed un **dayCost** (di tipo double) che rappresenta il costo; questi valori sono passati al costruttore.

3. Ogni carta **Business** ha un intero **code**, che rappresenta l’azienda proprietaria mediante il suo Codice Fiscale (un numero intero), e il suo costo annuale **annualCost** ; questi valori sono passati al costruttore.


**(B)**
  - Le Carte _Student_ e _Tourist_ (soltanto) possono acquisire dinamicamente speciali promozioni che modificano il calcolo del costo della Card. Queste promozioni possono essere cumulative.
  
  - Quindi si realizzi la promozione concreta **SUMMER**, che applica uno sconto del 20% ad una Carta Student o Tourist.
  Per esempio, prendiamo una MusCard che costa 25 Euro, ma ha attiva una promozione con un bonus di 5 Euro; _acquistando la             promozione Summer, il metodo getCost restituirà un costo attuale di 16 Euro._


# Esercizio 2 (facoltativo)
L’uso delle Lambda-expressions, introdotte da Java 8, potrebbero semplificare la soluzione, da voi proposta all’Esercizio 1 per la questione delle Promozioni?
In caso affermativo, mostrate come avreste realizzato la promozione SUMMER utilizzando le lambda-expressions.
In caso negativo, fornite qualche motivazione alla risposta.



## UML Representation of the purposed solution

![UML Representation](https://imagizer.imageshack.com/img923/2797/zbhatx.png)
