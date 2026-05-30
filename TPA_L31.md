## Tipuri Generice

Un magazin online vinde produse de diferite tipuri: carti, haine, electronice, etc. Pentru a putea gestiona aceste produse, magazinul poate folosi o structura de date generica care poate stoca orice tip de produs. De exemplu, putem defini o clasa generica `Product<T>` care poate stoca un produs de orice tip.

Clasa trebuie sa aiba un atribut `item`, cel putin un constructor care sa initializeze acest atribut, o metoda `getItem()` care sa returneze produsul stocat si o metoda `setItem(T item)` care sa permita modificarea produsului stocat.

---

Firma de curierat RapidBox livrează zilnic multe tipuri diferite de obiecte către clienți. Într-o singură zi pot exista livrări precum un plic cu documente, un colet cu haine, un pachet cu electronice și așa mai departe. Programatorii companiei vor să creeze o soluție flexibilă, astfel încât sistemul să poată gestiona orice tip de colet, fără să scrie câte o clasă separată pentru fiecare obiect transportat. Rezolva tu aceasta problema!

Se vor defini obiectele livrate (tipul lor), adresa destinatarului si se va implementa o metoda care sa afiseze toate aceste informatii intr-un format usor de citit.

```txt
Se livreaza Flori catre Bulevardul Corneliu Coposu nr. 20, Timisoara.

Se livreaza [Produs] catre [Adresa Destinatarului].
```

---


## Colectii

La intrarea pe o arena unde trupa ta favorita sustine un concert, trebuie sa scanezi biletul pentru a putea intra.

Urmatoarele bilete sunt scanate:
```txt
A102
B340
A102
C118
D502
B340
E777
```

Unii participanti au scanat biletul de mai multe ori. Organizatorii doresc sa afle: 
1. Cate bilete au fost scanate?
2. Cati paticipanti unici au scanat biletele?

---

Sa se creeze o agenda telefonica care sa stocheze numele persoanei si numarul de telefon. Se vor adauga cel putin 5 persoane in agenda, iar apoi se va afisa lista completa a persoanelor din agenda.

---

Un utilizator isi noteaza melodiil ascultate azi:

```txt
1. Cry - Benson Boone
2. As It Was - Harry Styles
3. Cry - Benson Boone
4. What Was I Made For? - Billie Eilish
5. Secrets - OneRepublic
6. house of the rising sun - The Animals
7. As It Was - Harry Styles
8. Society - Eddie Vedder
```

Stocheaza playlistul complet. Afiseaza-l. Construieste o structura care sa pastreze doar melodiile unice. Compara numarul total de melodii cu numarul de melodii unice. Afiseaza ambele numere.

---
