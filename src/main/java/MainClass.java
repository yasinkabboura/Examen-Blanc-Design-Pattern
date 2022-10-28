import PatternComposite.*;
import ObserverPattern.Coloers;
import ObserverPattern.ObservableImpl;
import StrategyPattern.Strategy;
import StrategyPattern.StrategyImpl;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ObservableImpl observable = new ObservableImpl();

        Coloers coloers = new Coloers();

        Strategy strategy =  new StrategyImpl();

        Rectangle rec1 = new Rectangle(observable,2,4);
        Rectangle rec2 = new Rectangle(observable,3,2);
        Cercle cer1 = new Cercle(observable,5);
        Cercle cer2 = new Cercle(observable,4);

        Dessin dessin = new Dessin(strategy);

        dessin.ajouter(rec1);
        dessin.ajouter(rec2);
        dessin.ajouter(cer2);
        dessin.ajouter(cer1);

        dessin.afficher();
        dessin.sérialiser();

        coloers.setCouleurContour("Green");
        observable.setColoers(coloers);
        cer1.afficher();

        coloers.setCouleurContour("Red");
        coloers.setCouleurRemplissage("lime");
        observable.setColoers(coloers);
        cer1.afficher();



    }
}
