import java.util.ArrayList;
import java.util.List;

// for the sake of a fucking start
// /Users/hendrikvh/IdeaProjects/BwinfTueten/Henni/test.txt
public class Main {

    public static void main (String args[])
    {

        FileIO.setFileName( "/Users/hendrikvh/IdeaProjects/BwinfTueten/Henni/test.txt" );

        // Die Liste enthält:
        // Pos 1: Anzahl der Tüten
        // Pos 2: Anzahl der Spielsorten
        // Pos 3..: Anzahl der Spiele pro Sorte
        ArrayList<String> aufgabenListe = FileIO.getDieZeilen(true);

        // Okay, was haben wir?
        System.out.println("Anzahl der Tüten: " + Integer.parseInt(aufgabenListe.get(0)));
        System.out.println("Anzahl der Spielsorten: " + Integer.parseInt(aufgabenListe.get(1)));

        for(int i = 0; i < (Integer.parseInt(aufgabenListe.get(2)) - 1 ); i++){

            System.out.println("Spiel " + (i+1) + " ist " + Integer.parseInt(aufgabenListe.get((i + 2))) + " Mal vorhanden.");

        }
        // ---

        // Packen wir die Werte mal in Variablen und Arrays
        int numBags = Integer.parseInt(aufgabenListe.get(0));
        int numGameTypes = Integer.parseInt(aufgabenListe.get(1));
        int[] gamesArray = new int[ numGameTypes ];

        for (int i = 0; i < gamesArray.length; i++){

            gamesArray[i] = Integer.parseInt(aufgabenListe.get((i+2)));

        }

        // Pro Tüte eine Liste erstellen? Vorteil wäre, dass man die Listen
        // füllen und den Inhalt prüfen / ausgeben kann
        List<List<String>> tuetenListe = new ArrayList<>();

        for (int i = 0; i < numBags; i++){

            tuetenListe.add( new ArrayList<String>() );

        }

        System.out.println("Anzahl der Tüten in der Liste: " + tuetenListe.size());

        // Zwei Elemente in die erste Tüte packen
        tuetenListe.get(0).add("Hallo");
        tuetenListe.get(0).add("Welt!");

        System.out.println("Anzahl der Elemente in Tüte 1: " + tuetenListe.get(0).size());

        for ( String inhalt : tuetenListe.get(0) ){
            System.out.println( inhalt );
        }

    }

}
