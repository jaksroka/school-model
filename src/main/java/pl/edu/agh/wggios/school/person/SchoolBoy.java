package pl.edu.agh.wggios.school.person;

import pl.edu.agh.wggios.school.outfit.Outfit;
import pl.edu.agh.wggios.school.outfit.SchoolBoyUniform;

public class SchoolBoy extends Pupil {

    private final SchoolBoyUniform outfit;

    public SchoolBoy(String name, String surname, int age, SchoolBoyUniform outfit) {
        super(name, surname, age, Male.MALE);
        this.outfit = outfit;
    }

    @Override
    public Outfit getOutfit() {
        return outfit;
    }
}
