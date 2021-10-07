package main.controller;

import main.data.DataHandler;
import main.model.Schueler;
import main.view.*;

import java.util.Vector;

/**
 * Beschreibung der Klasse
 *
 * @author Martin Düppenbecker
 * @version 1.0
 * @since 04.10.2021
 */

public class Classlet {
    private DataHandler dataHandler;

    private SpielGUI spielGUI;
    private HauptseiteGUI haupseiteGUI;
    private static String[] klassenliste;

    public Classlet(){
        dataHandler = DataHandler.getInstance();
        klassenliste = new String[1];
        klassenliste[0] = "IA21b";

        dataHandler.readBilder(klassenliste[0]);

        haupseiteGUI = new HauptseiteGUI(0, dataHandler.alleKlassenNamen());
        //dataHandler.writeHTML(klassenliste);


    }

    public static Vector<Schueler> neueRandomSchuelerListe(String[] klassenNamen){
        return DataHandler.getInstance().randomSchuelerListe(klassenNamen);
    }






    public static void main(String[] args) {
        DataHandler handler = DataHandler.getInstance();
        new Classlet();
        /*
        System.out.println(DataHandler.getProperty("resourcePath"));
        DataHandler handler = DataHandler.getInstance();
        handler.readBilder("IM21a");

        System.out.println(DataHandler.getKlassen().get("IM21a").getName());
        DataHandler.changeNotizen(DataHandler.getKlassen().get("IM21a").getSchuelers().get("Lucas_Blom"), "Testtestetst");
        DataHandler.changeNotizen(DataHandler.getKlassen().get("IM21a").getSchuelers().get("Marco_Spina"), "Bitet");

         */
    }
}
