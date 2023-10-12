import java.util.ArrayList;

// for the sake of a fucking start
// /Users/hendrikvh/IdeaProjects/BwinfTueten/Henni/test.txt
public class Main {

    public static void main (String args[])
    {

        FileIO.setFileName( "/Users/hendrikvh/IdeaProjects/BwinfTueten/Henni/test.txt" );

        // Die Liste enthält:
        // Pos 1: Anzahl der Tüten
        // Pos 2: Anzahl der Spielsorten
        // Pos 3: Anzahl der Spiele pro Sorte
        ArrayList<String> aufgabenListe = FileIO.getDieZeilen(true);

        System.out.println("Anzahl der Tüten: " + Integer.parseInt(aufgabenListe.get(0)));
        System.out.println("Anzahl der Spielsorten: " + Integer.parseInt(aufgabenListe.get(1)));

        for(int i = 0; i < (Integer.parseInt(aufgabenListe.get(2)) - 1 ); i++){

            System.out.println("Spiel " + (i+1) + " ist " + Integer.parseInt(aufgabenListe.get((i + 2))) + " Mal vorhanden.");

        }

    }

}
