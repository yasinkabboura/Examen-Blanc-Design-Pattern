package DessinPackage;

public class Rectangle implements Shape, Observer{
    ObservableImpl observable = new ObservableImpl();
    double l,h;
    Coloers coloers = new Coloers();

    public Rectangle(ObservableImpl observable,double l,double h) {
        this.observable = observable;
        observable.addObserver(this);
        this.h = h;
        this.l = l;
    }

    @Override
    public void afficher() {
        System.out.println("Rectangle");
        System.out.println("longeur "+l+" largeur "+ h);
        System.out.println("epaisseur "+coloers.getEpaisseur()+" couleurde contour "+ coloers.getCouleurContour()
        +" couleurde remplissage "+coloers.getCouleurRemplissage());
    }
    public double calculerPerimetre(){
        return (l+h)*2;
    }
    public double calculerSurface(){
        return l*h;
    }

    @Override
    public void update() {
        coloers = observable.getColoers();
    }
}
