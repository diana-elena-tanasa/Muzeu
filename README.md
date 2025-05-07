# Muzeu

**Muzeu** este o aplicație Java care simulează funcționarea unui muzeu digital. 
Scopul proiectului este de a modela structura unui muzeu real, cu galerii, exponate, vizitatori și bilete, folosind conceptele de bază din programarea orientată pe obiecte.

---

## Clase principale

| Clasă        | Descriere                                                                 |
|--------------|---------------------------------------------------------------------------|
| `Muzeu`      | Clasa principală care gestionează întregul sistem: galerii, bilete, vizitatori. |
| `Galerie`    | Reprezintă o colecție de exponate cu o tematică specifică.                |
| `Exponat`    | Reprezintă un obiect aflat în muzeu (ex: pictură, statuie, artefact etc.).|
| `Vizitator`  | Reprezintă o persoană care vizitează muzeul și poate achiziționa un bilet.|
| `Bilet`      | Reprezintă accesul unui vizitator într-o anumită galerie sau zonă a muzeului. |

---

## Funcționalități de bază

- Adăugarea de galerii și exponate în muzeu
- Înregistrarea vizitatorilor
- Emiterea și validarea biletelor
- Afișarea informațiilor despre exponate și locația lor
- Posibilitatea de a parcurge muzeul virtual prin galerii

---

## Tehnologii folosite

- Java SE (POO)
- Structuri de date (`List`, `Map`)
- Clase compuse și relații între obiecte
- Sisteme simple de căutare și filtrare

---

## Cum rulezi proiectul

1. Clonează repository-ul:https://github.com/diana-elena-tanasa/Muzeu.git
2. Deschide proiectul în IntelliJ IDEA sau alt IDE Java 
3. Rulează clasa Main

## Ce am învățat
- Modelarea unui sistem real (muzeu) în cod
- Lucrul cu concepte OOP: compoziție, agregare, incapsulare
- Utilizarea listelor de obiecte și interacțiuni între ele
- Simularea unui flux de utilizatori într-un sistem Java