package com.example.harnaud.biblio;

/**
 * Created by harnaud on 01/12/2017.
 */

public class Livre {
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {return this.titre;}

    public String getAuteur() {return this.auteur;}
}
