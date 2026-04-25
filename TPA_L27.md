1. Se defineste un formular de inscriere pentru un eveniment, care contine urmatoarele campuri: nume, prenume, adresa de email, numar de telefon si o casuta de validare pentru acceptarea termenilor si conditiilor. Implementeaza o metoda care verifica urmatoarele reguli de validare:
   - numele si prenumele trebuie sa contina doar litere si sa aiba cel putin 2 caractere, altfel se va arunca `IllegalArgumentException` cu mesajul "Numele si prenumele trebuie sa contina doar litere si sa aiba cel putin 2 caractere".
    - adresa de email trebuie sa contina un simbol @, altfel se va arunca `InvalidEmailException` cu mesajul "Adresa de email invalida".
    - numarul de telefon trebuie sa contina doar cifre si sa aiba exact 10 caractere, altfel se va arunca `InvalidPhoneNumberException` cu mesajul "Numar de telefon invalid".
    - casuta de validare pentru acceptarea termenilor si conditiilor trebuie sa fie bifata, altfel se va arunca `TermsNotAcceptedException` cu mesajul "Trebuie sa acceptati termenii si conditiile pentru a va inscrie".

2. Scrie o clasa `ATMalfa` care simuleaza un bancomat. Clasa trebuie sa aiba urmatoarele metode:
   - `deposit(double amount)`: adauga o suma de bani la soldul contului. Daca suma este negativa, se va arunca `IllegalArgumentException` cu mesajul "Suma de depunere trebuie sa fie pozitiva".
   - `withdraw(double amount)`: retrage o suma de bani din cont. Daca suma este negativa sau daca soldul contului este insuficient pentru a acoperi retragerea, se va arunca `IllegalArgumentException` cu mesajul "Suma de retragere trebuie sa fie pozitiva si sa nu depaseasca soldul contului".
   - `getBalance()`: returneaza soldul curent al contului.

3. Creeaza o clasa `Library` care gestioneaza o colectie de carti. Clasa trebuie sa aiba urmatoarele metode:
   - `addBook(String title, String author)`: adauga o carte in colectie. Daca titlul sau autorul sunt goale, se va arunca `IllegalArgumentException` cu mesajul "Titlul si autorul cartii nu pot fi goale".
   - `removeBook(String title)`: elimina o carte din colectie. Daca cartea nu exista, se va arunca `BookNotFoundException` cu mesajul "Cartea cu titlul specificat nu a fost gasita".
   - `getBooks()`: returneaza o lista cu toate cartile din colectie
    - `findBooksByAuthor(String author)`: returneaza o lista cu toate cartile scrise de autorul specificat. Daca nu exista carti scrise de acel autor, se va arunca `AuthorNotFoundException` cu mesajul "Nu au fost gasite carti scrise de autorul specificat".

4. Se defineste o aplicatie pentru rezervarea camerelor de hotel. Hotelul are mai multe camere, fiecare cu un numar de identificare unic, iar fiecare camera poae fi libera sau ocupata. Un client poate incerca sa rezerve o camera, iar daca aceasta este libera, rezervarea va fi confirmata. Daca camera este deja ocupata, se va arunca `RoomAlreadyBookedException` cu mesajul "Camera cu numarul specificat este deja ocupata". De asemenea, daca clientul incearca sa rezerve o camera care nu exista, se va arunca `RoomNotFoundException` cu mesajul "Camera cu numarul specificat nu a fost gasita". Daca rezervarea este confirmata, se va actualiza starea camerei la "ocupata". Implementati metodele necesare pentru a gestiona rezervarile si pentru a verifica disponibilitatea camerelor.