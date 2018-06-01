import Areas.PaddockOne;
import Areas.PaddockType;
import Species.Dinosaur;
import Species.DinosaurType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PaddockOneTest {

    PaddockOne paddockOne;
    private ArrayList<Dinosaur> dinosaurs;
    Dinosaur ankylosaurus, brachiosaurus;

    @Before
    public void setup() {
        paddockOne = new PaddockOne("Galliminus Valey", PaddockType.FREE_FROM_PREDATORS);
        this.dinosaurs = new ArrayList<Dinosaur>();
        Dinosaur ankylosaurus = new Dinosaur(5, DinosaurType.HERBIVORE) {};
        Dinosaur brachiosaurus = new Dinosaur(7, DinosaurType.HERBIVORE) {};
    }

    @Test
    public void paddockHasName() {
        assertEquals("Galliminus Valey", paddockOne.getName());
    }

    @Test
    public void paddockHasType() {
        assertEquals(PaddockType.FREE_FROM_PREDATORS, paddockOne.getType());
    }

    @Test
    public void paddockStartEmpty() {
        assertEquals(0, paddockOne.getCount());

    }

    @Test
    public void paddockCanAddDinosaur() {
        paddockOne.addDinosaur(ankylosaurus);
        assertEquals(1, paddockOne.getCount());
    }

    @Test
    public void paddockCanRemoveDinosaur() {
        paddockOne.addDinosaur(ankylosaurus);
        paddockOne.addDinosaur(brachiosaurus);
        paddockOne.removeDinosaur();
        assertEquals(1, paddockOne.getCount());

    }
}
