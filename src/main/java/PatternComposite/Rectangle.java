package PatternComposite;

import ObserverPattern.Coloers;
import ObserverPattern.ObservableImpl;
import ObserverPattern.Observer;

import java.io.Serializable;

public class Rectangle implements Shape, Observer, Serializable {
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
    @Override
    public double calculerPerimetre(){
        return (l+h)*2;
    }
    @Override
    public double calculerSurface(){
        return l*h;
    }

    @Override
    public void update() {
        coloers = observable.getColoers();
    }
}
