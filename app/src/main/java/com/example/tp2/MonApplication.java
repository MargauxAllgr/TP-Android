package com.example.tp2;

import java.util.ArrayList;

import modele.Etudiant;

public class MonApplication {
    private static ArrayList<Etudiant> listeEtudiants = new ArrayList<>();

    public static ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public static void setListeEtudiants(ArrayList<Etudiant> listeE) {
        listeEtudiants = listeE;
    }

}
