  1. Konzolos asztali alkalmazás

Adott két adatfájl:
• jarmuvek_opel.csv
• jarmuvek_opel.json
A két fájl ugyanazokat az adatokat tartalmazza csak két különböző formátumban. A fájlok egy
használt jármű kereskedés adatai.
A fájlok Opel márkájú adatokat kell tartalmaznia, de hibásan más adatok is előfordulnak. Azokat a
sorokat, amelyek Opel márkát tartalmazzák, külön fájlba kell másolnia.
Készítsen opel néven konzolos asztali alkalmazást. Végezze el a következő feladatokat.
• Készítsen megfelelő adatszerkezetet a fájl sorainak tárolására.
• Nyissa meg a jarmuvek_opel.csv vagy a jarmuvek_opel.json fájlt.
• Olvassa be a fájl első sorát, majd tárolja.
• Olvassa be a fájl többi sorát, majd tárolja egy listába.
• Készítsen kivonat() metódust.
• A kivonat() metódus az opel márkájú adatokat töltse egy másik opel_lista nevű listába.
• Az opel_lista tartalmát írassa a onlyopel.csv vagy onlyopel.json fájlba.


  2. GUI asztali alkalmazás

Készítsen opelgui néven GUI asztali alkalmazást. Az előző feladat onlyopel.csv vagy ha
onlyopel.json fájlt készített akkor azt használjuk. A fájl tartalmát kell megjeleníteni GUI felületen
soronként.
A feladat leírása részletesen:
• Nyissa meg a onlyopel.csv vagy onlyopel.json fájlt.
• Olvass be egy megfelelő lista adatszerkezetbe.
• Jelenítse meg a GUI felületen az első sor tartalmát.
• Legyen a GUI felületen egy „Következő” és egy „Előző” lapozó gomb.
• A „Következő” gombra kattintva jelenítse meg a listában a következő járművet.
• Az „Előző” gombra kattintva jelenítse meg a listában az előző listaelemet.
• A GUI elemre tegyen egy
A sorok legyenek lapozhatók.
Készítsen egy adatbázist opel néven, amiben tárolhatók az állomány sorai.
A GUI felületen az aktuális adatokat egy kattintással lehessen az adatbázisba beszúrni.
Exportálja az adatbázist opel.sql nevű fájlba.

  3. Reszponzív weboldal

Egy statikus reszponzív webhelyet kell készítenie navigációval kocsi néven. A navigáció két
komponenst tartalmazzon:
• index
• vasarlas

index komponens
Az index nevű komponensen jelenítése meg a következő feliratot egyes szintű fejezetcímmel:
„Használt járművek”.

vasarlas komponens
A vasarlas nevű komponensben járművek adatait kell megjeleníteni. A forrásfájlok között, talál egy
jarmu.js fájlt. Talál benne egy tömböt.
Másolja a tömböt a saját TypeScript vagy JavaScript forrásállományába. Jelenítse meg vasarlas
komponensben.
Ügyeljen arra, hogy telefonon is olvasható felültet kapjon.

  4. Backend

Backend alkalmazást kell készíteni a járművek tárolására. A következő adatokat kell tárolnia:
• az
• rendszám
• márka
• ár
Feladatok:
• Hozza létre a Backend alkalmazást.
• Hozza létre a lenti táblázatban található útvonalakat.
• Hozza létre az útvonalakhoz tartozó függvényeket a kontrollerben.
• A járműveket JSON formátumban kell kezelni.
Végpont Metód
us
CRUD
művelet

Azonosítás

Leírás
jarmuvek GET read nem Az összes járművet visszaadja
jarmuvek POST create nem Felveszi a json formátumban küldött járművet
jarmuvek/{id} PUT update nem Módosít egy járművet
jarmuvek/{id} DELE
TE
delete nem Törli a megadott járművet


  5. Frontend

Vegye elő a „kocsi” nevű projektet, ami egy reszponzív weboldal. Alakítsa át, hogy a weblap az
adatokat a Backendből töltse le.
Ha nem felel meg a „kocsi” nevű projekt, készíthet új weboldat.
• A webhelyet az ön által tanult frontend keretrendszerrel kell elkészítenie.
• Backendnek az előző feladatban elkészített projektet kell használnia. Ennek hiányában
használhat helyettesítésre json-server vagy hai-server NodeJS csomagokat.
• Jelenítse meg az összes járművet táblázatban.
• Lehessen felvenni egy új járművet.
