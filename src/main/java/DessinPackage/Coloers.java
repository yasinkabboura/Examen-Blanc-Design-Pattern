package DessinPackage;

public class Coloers {
    int epaisseur;
    String couleurContour;
    String couleurRemplissage;

    public Coloers() {
        this.epaisseur = 1;
        this.couleurContour = "Black";
        this.couleurRemplissage = "White";
    }

    public Coloers(int epaisseur, String couleurContour, String couleurRemplissage) {
        this.epaisseur = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }
}
