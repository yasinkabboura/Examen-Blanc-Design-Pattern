package DessinPackage;

public class Cercle implements Shape,Observer{
    ObservableImpl observable = new ObservableImpl();
    Coloers coloers = new Coloers();
    double rayon;

    public Cercle(ObservableImpl observable, double rayon) {
        this.observable = observable;
        observable.addObserver(this);
        this.rayon = rayon;
    }
    @Override
    public void afficher() {
        System.out.println("Cercle");
        System.out.println("Rayon "+rayon);
        System.out.println("epaisseur "+coloers.getEpaisseur()+" couleurde contour "+ coloers.getCouleurContour()
                +" couleurde remplissage "+coloers.getCouleurRemplissage());
    }
    public double calculerPerimetre(){
        return 2*Math.PI*rayon;
    }
    public double calculerSurface(){
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public void update() {
        coloers = observable.getColoers();
    }
}
