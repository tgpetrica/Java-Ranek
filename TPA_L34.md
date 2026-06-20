## clase inner static

Se dorește realizarea unei aplicații Java care conține regulile unui joc. Se va crea clasa `Joc`, iar în interiorul acesteia se va declara clasa inner statică `Reguli`. Clasa `Reguli` va conține metodele `afiseazaReguliStart()` și `afiseazaReguliFinal()`, care vor afișa reguli generale ale jocului, precum numărul minim de jucători sau condiția de câștigare. În metoda `main`, se va crea un obiect al clasei `Joc.Reguli` și se vor apela metodele acesteia. Clasa statică nu trebuie să folosească atributele non-statice ale clasei `Joc`.

---

## clase inner non-static

Se dorește realizarea unei aplicații Java pentru gestionarea unui cont bancar. Se va crea clasa `ContBancar`, care reține numele titularului și soldul disponibil. În interiorul clasei se va declara clasa inner non-statică `Card`, care va avea metoda `plateste(double suma)`. Metoda trebuie să verifice dacă există suficienți bani în cont, să modifice soldul în cazul unei plăți valide și să afișeze un mesaj corespunzător. În metoda `main`, se va crea un cont bancar și un card asociat acelui cont.

---

## clase locale

Se dorește realizarea unei aplicații Java care stabilește rezultatul unui elev la un test. Se va crea clasa `Evaluare`, care va conține metoda `calculeazaRezultat()`. În această metodă se va declara o variabilă locală pentru numele elevului și una pentru nota obținută. Se va declara apoi o clasă locală `RaportEvaluare`, care va avea metoda `afiseazaRezultat()`. Metoda va afișa numele elevului, nota și mesajul „Promovat” sau „Nepromovat”, în funcție de nota obținută.

---

## clase anonime

Se dorește realizarea unei aplicații Java pentru simularea unei alarme. Se va declara interfața `Alarma`, care conține metoda `pornesteAlarma()`. În metoda `main`, se va crea un obiect anonim care implementează interfața `Alarma`. Metoda `pornesteAlarma()` va afișa mesajul „Atenție! Alarmă activată!”. Obiectul anonim va fi apelat imediat după creare.

Nota: toate clasele se vor declara intr-un singur fisier Java, iar metodele vor fi apelate în metoda `main` pentru a demonstra funcționalitatea fiecărei clase.