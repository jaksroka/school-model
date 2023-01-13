package pl.edu.agh.wggios.school.person;

import pl.edu.agh.wggios.school.outfit.Outfit;
import pl.edu.agh.wggios.school.outfit.SchoolGirlUniform;

public class SchoolGirl extends Pupil {

    private final SchoolGirlUniform outfit;

    public SchoolGirl(String name, String surname, int age, SchoolGirlUniform outfit) {
        super(name, surname, age, Male.FEMALE);
        this.outfit = outfit;
    }

    @Override
    public Outfit getOutfit() {
        return outfit;
    }
}
