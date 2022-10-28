package DessinPackage;

import java.util.ArrayList;
import java.util.List;

public class Figure implements Shape{
    List<Shape> shapeList = new ArrayList<>();
    @Override
    public void afficher() {
        for (Shape shape : shapeList) {
            shape.afficher();
        }
    }

}
