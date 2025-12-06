Un lant are 3 magazine.

Se da un array cu numarul de clienti care vin in fiecare ora

```java
int[] clienti = {12, 4, 8, 5, 10, 6};
```

Fiecare client trebuie trimis catre unul dintre cele 3 magazine.

Vrem sa aflam **cati clienti ajung in total la fiecare magazin**, daca ii trimitem pe rand, astfel:
- primul client merge la magazinul 0
- al doilea client la magazinul 1
- al treilea client la magazinul 2
- apoi din nou la magazinul 0, 1, 2, ...

Pasi de rezolvare:
1. Se va rezolva in clasa RepartizareClienti
2. Se declara un array cu 3 elemente pentru magazine
3. Se declara un array cu numarul de clienti distribuiti pe fiecare ora.
4. Foloseste o bucla cu numar cunoscut de pasi pentru a atribui cate un client fiecarui magazin
5. Afiseaza cati clieti au ajuns la fiecare magazin.

Rezolvare: [@809f4b3](https://github.com/tgpetrica/Java-Ranek/blob/809f4b38031530409cb4016a57184526b8f8c2d6/RepartizareClienti.java)
