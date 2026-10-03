1. even odd counter (citesc un int[] => returnez cate pare, cate impare)
2. find maximum number in a list (citesc un int[] => returnez maximul)
3. reverse a string (citesc un string => returnez stringul inversat)
4. count vowels in a string (citesc un string => returnez numarul de vocale)
5. binary permission checker (citesc un int => returnez daca are permisiuni)
6. remove duplicates from a list (citesc o lista => returnez lista fara duplicate)
7. student average calculator (citesc un array de note => returnez media si numarul de studenti cu medie mai mare decat un prag dat)
8. number base converter (citesc un numar in baza 10 => returnez numarul in alta baza)
9. password strength evaluator (citesc un string => returnez gradul de putere)
10. ATM account : balance, deposit(), withdraw(), getBalance()
11. Vehicle, Car, Motorcycle : inheritance and method overriding, polymorphism
12. Shape: abstract class
13. Payable interface: Employee, Invoice classes implementing the interface
14. word frequency counter (citesc un string => returnez frecventa fiecarui cuvant)
15. list removal based on condition (citesc o lista si o conditie => returnez lista fara elementele care indeplinesc conditia)



Scrieți un program  care simulează votul Consiliului Imperial Bizantin. Fiecare participant poate exprima unul dintre cele patru voturi disponibile: 
`1 - IMPERIAL_ADVANCE`, 
`2 - STRATEGIC_RETREAT`, 
`3 - FALSE_DECREE` și 
`4 - HOLD_THE_WALLS`. 
Programul trebuie să permită introducerea de la tastatură a unui număr variabil de voturi, separate prin spații, citirea încheindu-se în momentul în care utilizatorul apasă tasta Enter. Numai valorile numerice cuprinse între 1 și 4 inclusiv sunt considerate voturi valide, iar orice altă valoare introdusă trebuie ignorată. După procesarea datelor, programul va afișa numărul total de voturi valide și va determina sentința Consiliului pe baza opțiunii care a primit cele mai multe voturi. Dacă două sau mai multe opțiuni se află la egalitate pentru cel mai mare număr de voturi, rezultatul va fi `COUNCIL_DIVIDED`. Dacă nu a fost introdus niciun vot valid, programul va afișa `NO_VALID_DECREE`.