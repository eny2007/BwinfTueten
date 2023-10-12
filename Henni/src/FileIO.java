import java.io.*;
import java.util.*;

class FileIO
{
    private static BufferedReader in = null;
    private static ArrayList<String> dieZeilen = null;

    private static String ReadLn ()  // utility function to read from stdin
    {
        String s = null;

        try { s=in.readLine(); }
        catch (IOException e)
        {
            return (null);
        }

        return s;
    }

    public static void datenAusgeben(ArrayList<String> liste) {
        for (String zeile : liste) {
            System.out.println(zeile);
        }
    }

    public static boolean datenEinlesen()
    {
        boolean datenSindEingelesen = false;

        /** Name der Datei von der Konsole holen */
        Scanner sc = new Scanner(System.in);
        System.out.println( "Bitte geben Sie den Dateinamen ein:" );
        String sFileName = sc.nextLine();

        /** Datei öffnen, bei Fehler Meldung ausgeben und abbrechen */
        try {
            in = new BufferedReader( new InputStreamReader( new FileInputStream( new File( sFileName ) )));

            /** alle Zeilen der Datei zeilenweise in eine ArrayList einlesen */
            dieZeilen = new ArrayList<String>();
            boolean fLoop = true;
            while( fLoop ) {
                /** versuchen, eine Zeile zu lesen */
                String sLine = ReadLn();
                /** wenn eine nicht-leere Zeile gelesen wurde, diese an die ArrayList anhängen,
                 ansonsten Schleife verlassen */
                if( sLine != null ) {
                    dieZeilen.add( sLine );
                }
                else {
                    fLoop = false;
                }
            }
            datenSindEingelesen = true;

        }
        catch( IOException e ) {
            System.err.println( "Die Datei kann nicht geöffnet werden.\nUrsache: " + e);
        }

        datenAusgeben(dieZeilen);
        return datenSindEingelesen;
    }

}
