<img width="573" height="119" alt="image" src="https://github.com/user-attachments/assets/b41da97c-34ac-4866-b7cd-14bf3e791867" />

`(x * 3 <= z) && (y % 3 == 0)`

Se inlocuiesc valorile din expresie cu valorile date:

`(4 * 3 <= 12) && (9 % 3 == 0)`

Se verifica conditiile:
- este 12 (adica 4 * 3) mai mic sau egal decat 12? DA
- este restul impartirii lui 9 la 3 egal cu 0? DA

Se rezolva expresia `TRUE AND TRUE` => `TRUE`

Raspuns **TRUE**

---

Pentru cea de-a doua expresie data:

`(z / x == 3) && !(y % 2 == 0)`

Se inlocuiesc valorile din expresie cu valorile date:

`(12 / 4 == 3) && !(9 % 2 == 0)`

Se verifica conditiile:
- este catul impartirii lui 12 la 4 egal cu 3? DA
- restul impartii lui 9 la 2 este diferit de 0? DA

Se rezolva expresia `TRUE AND TRUE` => `TRUE`

Raspuns **TRUE**

---

---

Se dau variabilele:

<img width="498" height="64" alt="image" src="https://github.com/user-attachments/assets/57573473-3693-475b-a73d-223ab3204858" />

Si expresia `a = (b += 2) * (c / 2);`

Se inlocuiesc valorile din expresie cu valorile date: `a = (b += 2) * (8 / 2);`

⚠️ Operatorul de dupa `a` este operatorul de atribuire `=`, diferit de operatorul relational `==`. Asadar, calculul valorilor din dreapta va da noua valoare a variabilei `a`.

⚠️ Operatoul de dupa `b` este operatorul de atribuire prin adunare `+=`, care adauga la `b` valoarea `2`.

Noua valoare a lui `a` este:
- vechea valoare a lui `b`, la care se aduna `2`. Deci noul `b` are valoarea `3 + 2`, adica `5`.
- rezultatul celei de-a doua paranteze este catul impartirii lui 8 la 2, adica 4.
- se inmultesc cele doua paranteze, adica **noua** valoare a lui `b` cu 4, adica 5 * 4, adica 20
- iar acest 20 este asignat variabilei `a`

Raspuns: in urma executiei expresiei date, variabila `a` are valoarea `20`.

---

Se da expresia `a = (a + b) * (c - a % b);`

Se inlocuiesc variabilele cu valorile lor.

❗ Vorbim din nou de operatorul `=`, de atribuire

`a = (5 + 3) * (8 - 5 % 3);`

- se rezolva parantezele
- prima paranteza este `8`
- a doua paranteze: se rezolva mai intai impartirea cu rest a lui 5 la 3... restul impartirii lui 5 la 3 este 2, apoi, din 8 se scade 2, deci a doua paranteze este 8-2 => 6
- se inmultesc cele doua rezultate, 6 * 8 => 48

Raspuns: in urma executiei expresiei date, variabila `a` are valoarea `48`.

---

---

<img width="583" height="109" alt="image" src="https://github.com/user-attachments/assets/0dec70d0-770a-48e0-a1f0-a39213a1b86c" />

Se da expresia `p = (x + y > z) && (z % 2 == 0);`

Se inlocuiesc variabilele cu valorile lor: `p = (2 + 5 > 8) && (8 % 2 == 0);`

- prima paranteza: este 7 mai mare decat 8? NU
- a doua paranteza: este restul impartirii lui 8 la 2 egal cu 0 (adica nu are rest)? DA
- se testeaza conditia logica `TRUE AND FALSE`, care este `FALSE`.
- `FALSE` se atribuie variabilei `p`

Raspunsul: FALSE

---

Se da expresia `q = !(x > y && z < 10);`

Se inlocuiesc variabilele cu valorile lor: `q = !(2 > 5 && 8 < 10);`

Exista doua metode de rezolvare: 
1. Direct
  - 2 mai mare decat 5? NU
  - 8 mai mic decat 10? DA
  - `FALSE AND TRUE` => `FALSE`
  - `NOT FALSE` => `TRUE`
2. Prin Legea lui DeMorgen
  - `!(A && B)` echivalent cu `!A || !B`
  - `!(2 > 5 && 8 < 10)` echivalent cu `!(2 > 5) || !(8 < 10)`
  - este 2 mai mare decat 5 ? `FALSE`
  - dar `NOT FALSE` este `TRUE` <A>
  - este 8 mai mic decat 10? `TRUE`
  - dar `NOT TRUE` este `FALSE` <B>
  - `<A> OR <B>` este `TRUE OR FALSE`, adica `TRUE`

Raspuns: `TRUE`

---

Andrei are 12 ani și sora lui, Ioana, are 10 ani.

`if (andreiAge > 10 && ioanaAge > 10)`

👀 Ioana are fix 10 ani, 10 nu este mai mare decat 10. 

Raspuns: Cel puțin unul are peste 10 ani

---

E frig afară (temperatura = 4°C), dar Andrei are geacă.

`if (temperatura < 10 || areGeaca)`

- 4 mai mic decat 10? `TRUE`
- se spune si ca Andrei are geaca, deci `TRUE`
- `TRUE OR TRUE` este in final `TRUE`

⚠️ Cat timp temperatura este mai mica decat 10 grade Celsius, adica prima conditie este adevarata, Andrei poate sa iasa si cu si fara geaca afara. (IRL, de preferat cu geaca :) )

Raspuns: Poate ieși afară

---

Maria are bilet la cinema și are și bani de popcorn.  

`if (areBilet && areBani)`

Din enunt se intelege ca are deja bilet , dar si ca are bani pentru popcorn

Raspuns: Merge la film

---

Vlad are telefonul încărcat 15% și a uitat încărcătorul acasă.

`if (baterie < 20 && !areIncarcator)`

Fara sa analizam prea mult si conditia, logica ne-ar spune ca nu are cum sa isi foloseasca telefonul prea mult.

Inlocuim expresia cu ce cunoastem: `(baterie < 20 && !areIncarcator)` devine `(15 < 20 && !true)`

⚠️ `areIncarcator` este `true` daca Vlad chiar are incarcatorul la el. Dar, pentru ca nu il are, `!true` inseamna `false`.

- este 15 mai mic decat 20? `TRUE`
- `TRUE AND FALSE` => `FALSE`

Raspuns: Vlad nu poate folosi telefonul prea mult

---

Radu primește 5 lei în fiecare zi timp de 3 zile: `bani += 5 * 3;`  Câți bani are Radu?

⚠️ Da, se face inmultirea in dreapta si se atribuie noua valoare la `bani`. Asta inseamna ca va avea cu `15` lei in plus. In plus fata de ce valoare? Cati bani are Radu in total?

In mediul de programare, la scrierea anterioara, fara ca bani sa aiba o valoare initiala apare eroarea `error: variable bani might not have been initialized`

Raspuns: alt răspuns

---

Matei vrea să meargă în parc dacă:  
- e soare (soare == true)
- are voie de la părinți (voie == true)
- dar dacă plouă (ploua == true), rămâne acasă

`if (soare && voie && !ploua)`

- `TRUE AND TRUE AND FALSE` => `FALSE`

Raspuns: Nu merge
