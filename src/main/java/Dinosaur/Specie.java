package Dinosaur;


import Areas.Paddock;
import ThemePark.Park;
import Enum.DinosaurType;

import java.util.Random;

public abstract class Specie {

    private int stomach;
    protected int rampage;
    private DinosaurType dinosaurType;

    public Specie(int stomach, int rampage, DinosaurType dinosaurType) {
        this.stomach = stomach;
        this.rampage = rampage;
        this.dinosaurType = dinosaurType;
    }

    public DinosaurType getType() {
        return dinosaurType;
    }

    public int getStomach() {
        return stomach;
    }

    public void dinosaurIsFed() {
        this.stomach++;
    }


    public int getRampage() {
      Random rand = new Random();
      int n = rand.nextInt(10) + 1;
      return n;
    }


//    public void getHunt(Paddock paddock, Park park) {
//        if (getRampage() >= this.rampage ) {
//            paddock.removeDinosaur();
//            park.removeVisitor();
//            this.dinosaurIsFed();
//        }
//    }


}
