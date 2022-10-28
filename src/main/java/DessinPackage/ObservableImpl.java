package DessinPackage;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<Observer> observerList = new ArrayList<>();
    Coloers coloers = new Coloers();
    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }
    public void setColoers(Coloers coloers) {
        this.coloers.setCouleurContour(coloers.getCouleurContour());
        this.coloers.setEpaisseur(coloers.getEpaisseur());
        this.coloers.setCouleurRemplissage(coloers.getCouleurRemplissage());
        notifyObservers();
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public Coloers getColoers() {
        return coloers;
    }
}
