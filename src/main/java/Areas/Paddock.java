package Areas;

import Species.Dinosaur;
import Species.DinosaurType;

import java.util.ArrayList;

public class Paddock {

    private String name;
    PaddockType paddockType;
    private ArrayList<Dinosaur> dinosaurs;

    public Paddock(String name, PaddockType paddockType) {
        this.name = name;
        this.paddockType = paddockType;
        this.dinosaurs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public PaddockType getType() {
        return paddockType;
    }

    public int getCount() {
        return dinosaurs.size();
    }


    public void addDinosaur(Dinosaur dinosaur) {
        this.dinosaurs.add(dinosaur);
    }

    public void removeDinosaur() {
        this.dinosaurs.remove(0);
    }

    public boolean herbivoreOnly(){
        for (Dinosaur dinosaur : this.dinosaurs) {
            if (dinosaur.getType() == DinosaurType.HERBIVORE) {
            }
        }
        return true;
    }
}
