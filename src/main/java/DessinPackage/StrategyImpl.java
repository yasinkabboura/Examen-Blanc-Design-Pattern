package DessinPackage;

import java.io.Serializable;

public class StrategyImpl implements Strategy, Serializable {
    @Override
    public void traiter() {
        System.out.println("traiter from stratgic pattern");
    }
}
