package DessinPackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dessin implements Serializable {
    private Strategy strategy;
    List<Shape> shapeList = new ArrayList<>();

    public Dessin(Strategy strategy) {
        this.strategy = strategy;
    }

    public void traiter(){
        strategy.traiter();
    }
    public void ajouter(Shape shape){
        shapeList.add(shape);
    }
    public void supprimer(Shape shape){
        shapeList.remove(shape);
    }
    public void afficher(){
        for (Shape shape : shapeList) {
            shape.afficher();
        }
    }
    public void sérialiser(){
        FileOutputStream file = new FileOutputStream("exam.");
        ObjectOutputStream out = new ObjectOutputStream(file);

        // Method for serialization of object
        out.writeObject(object);

        out.close();
        file.close();

        System.out.println("Object has been serialized");
    }
}
