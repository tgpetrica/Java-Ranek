Se dau urmatorii vectori

```java
int[] v = {-79, -50, 85, 32, 73, -9};
int[] g = {11, 7, 34, 2};
```

## Urmatoarele probleme se vor rezolva in clasa **Tema9**:

1. Folosind vectorul `g`, calculati media geometrica a elementelor vectorului `g`.

Exemplu: pentru numerele: 2, 4, 2, 1, media geometrica este <img width="702" height="159" alt="image" src="https://github.com/user-attachments/assets/0092958d-0d15-40f4-b2c6-64e7dc53c044" />

Puteti folosi apel al metodei [Math.sqrt(double)](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#sqrt-double-)

2. Sa se declare o variabila intreaga `k` si o variabila intreaga `b`, apoi sa se initializeze cu valori introduse de programator. Sa se calculeze b<sup>k</sup>, prin inmultiri repetate.

## Urmatoarea problema se va rezolva in clasa **Digits**:

3. Pe baza unei variabile naturale `n`, sa se afiseze fiecare cifra a numarului `n` folosing simbolul `@`, ca in exemplu. `n` poate avea maximum 4 cifre.

```txt
  @
 @@
  @
  @
@@@@@

@@@@
@  @
  @
 @
@@@@

@@@@@
    @
@@@@@
    @
@@@@@

@   @
@   @
@@@@@
    @
    @

@@@@@
@
@@@@@
    @
@@@@@

@@@@@
@
@@@@@
@   @
@@@@@

@@@@
   @
  @@@
   @
   @

@@@@@
@   @
@@@@@
@   @
@@@@@

@@@@@
@   @
@@@@@
    @
    @

@@@@@
@   @
@   @
@   @
@@@@@
```

## Urmatoarele probleme se vor rezolva in clasa **Vectori9**

4. Sa se verifice daca vectorul `v` este ordonat strict crescator (un element de pe pozitia `i` este strict `>` mai mare decat elementul de pe pozitia `i - 1`.

5. Se da vectorul `g`. Sa se transforme vectorul, duplicand fiecare aparitie a valorii minime.

   Exemplu:
```txt
pentru: 7 9 4 2 1 6 1
  =>    7 9 4 2 1 1 6 1 1
```

## Urmatoarea problema se va rezolva in clasa **TwoGroups**

6. Se dă numărul natural n. Să se împartă numerele naturale de la 1 la n în două grupuri astfel încât diferența absolută dintre sumele numerelor din cele două grupuri să fie minimă. Programul va afișa pe ecran pe primul rând numerele din primul grup și pe al doilea rând numerele din al doilea grup, separate prin câte un spațiu. Ordinea afișării nu contează.

  Exemplu:
```txt
pentru: 5
  =>    5 2 1
        4 3

Strategie:
- Lista de numere este ordonata descresctor.
- Folosesti doua variabile suma, pentru cele doua grupuri: sum1 si sum2
- Pentru fiecare x din lista (de la mare la mic):
  - daca sum1 ≤ sum2 ⇒ pui x in grupul 1 si actualizezi sum1 += x
  - altfel           ⇒ pui x in grupul 2 si actualizezi sum2 += x

Numere: 5, 4, 3, 2, 1
start: sum1 = 0, sum2 = 0
5 → sum1 ≤ sum2 ⇒ grup1: {5}, sum1 = 5
4 → sum1 > sum2 ⇒ grup2: {4}, sum2 = 4
3 → sum1 > sum2 ⇒ grup2: {4, 3}, sum2 = 7
2 → sum1 ≤ sum2 ⇒ grup1: {5, 2}, sum1 = 7
1 → sum1 ≤ sum2 ⇒ grup1: {5, 2, 1}, sum1 = 8
```

