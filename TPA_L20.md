Se considera o aplicatie care modeleaza persoane din mediul educational.

Sa se creeze o clasa `Persoana` care contine atributele `nume` si `varsta`, un constructor pentru initializarea acestor atribute si metoda `toString()` care returneaza o reprezentare text a obiectului.

Sa se creeze o clasa `Profesor` care mosteneste clasa `Persoana` si adauga atributele `materie` si `salariu`, un constructor pentru initializarea acestor atribute si metoda `toString()` care returneaza o reprezentare text a obiectului.

In clasa `Profesor`, sa se implementeze supraincarcarea metodei `preda()` astfel:
- `preda()` care afiseaza un mesaj generic despre predare
- `preda(String subiect)` care afiseaza un mesaj specific despre predarea unui capitol sau subiect
- `preda(String subiect, int durata)` care afiseaza un mesaj despre predarea unui subiect pentru o anumita durata

Sa se creeze clasa `TestEducatie` care contine metoda `main` in case se:
- creeaza un obiect de tip `Persoana`
- creeaza un obiect de tip `Profesor`
- afiseaza obiectele folosind metoda `toString()`
- apeleaza toate variantele metodei `preda()` pentru a demonstra supraincarcarea