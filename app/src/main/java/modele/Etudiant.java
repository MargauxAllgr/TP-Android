package modele;

public class Etudiant {
    String nom;
    String prenom;
    char sexe;
    String dominante;


    public Etudiant(String nom, String prenom, char sexe, String dominante){
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dominante=dominante;
    }

    Etudiant(){
        nom="";
        prenom="";
        sexe='n';
        dominante="";
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getDominante() {
        return dominante;
    }

    public void setDominante(String dominante) {
        this.dominante = dominante;
    }
}
