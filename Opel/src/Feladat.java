import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Feladat {

    ArrayList<Jarmu> jarmulista = new ArrayList<>();    //1. megfelelő adatszerkezet a fájl sorainak tárolására
    ArrayList<Jarmu> opel_lista = new ArrayList<>();    //ide kell az Opeleket bepakolni
    ArrayList<String> jarmulista_header = new ArrayList<>();

    public void ReadFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba, a fájl nem található.");
            System.err.println(e.getMessage());
        }
    }

    public void tryReadFile() throws FileNotFoundException{
        File file = new File("jarmuvek_opel.csv");      //fájl tartalmának beolvasása, ez alap!
        Scanner sc = new Scanner(file, "utf-8");

        String header = sc.nextLine();                    
        for (String headerStr : header.split(":")) {
            jarmulista_header.add(headerStr);
        }

        while (sc.hasNext()) {                       //3. itt olvasódik be a fájl többi sora
            String line = sc.nextLine();             //nextLine-al kérünk következőp sort
            String[] lineArray = line.split(":");   //feldarabolás
            Jarmu jarmu = new Jarmu();
            jarmu.az = Integer.parseInt(lineArray[0]);
            jarmu.rendszam = lineArray[1];
            jarmu.marka = lineArray[2];
            jarmu.urtartalom = Integer.parseInt(lineArray[3]);
            jarmu.ar = Double.parseDouble(lineArray[4]);
            jarmulista.add(jarmu);      //4. tárolja a listában
        }
    }

    public void kivonat() {     //5. Készítsen kivonat() metódust.
        for (Jarmu jarmu : jarmulista) {        //itt kapom meg a jármu objektumot, lista bejárása for ciklussal
            if (jarmu.marka.equals("Opel")) {
                //System.out.println(jarmu.marka);
                opel_lista.add(jarmu);  //5. A kivonat() metódus az opel márkájú adatokat töltse egy másik opel_lista nevű listába.
            }
        }
    }

    public void fajlbaIr(){
        try {
            tryFajlbaIr();
        } catch (IOException e) {
            System.err.println("Hiba! A fájl nem írható");
            System.err.println(e.getMessage());
        }
    }

    public void tryFajlbaIr() throws IOException {
        FileWriter fw = new FileWriter("onlyopel.csv");     //6. Az opel_lista tartalmát írassa a onlyopel.csv fájlba.
        for (Jarmu jarmu : opel_lista) {
            fw.write(jarmu.az);     //most írom ki az azonosítót stb.
            fw.write(":");
            fw.write(jarmu.rendszam);     
            fw.write(":");
            fw.write(jarmu.marka);     
            fw.write(":");
            fw.write(jarmu.urtartalom.toString());     
            fw.write(":");
            fw.write(jarmu.ar.toString());     
            fw.write(":");
        }
        fw.close();     //le kell zárni fájlba írásnál, mert különben nem íródik ki

    }
}
