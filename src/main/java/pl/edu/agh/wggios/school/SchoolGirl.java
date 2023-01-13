package pl.edu.agh.wggios.school;

public class SchoolGirl extends Pupil {

    public SchoolGirl(String name, int age, String className) {
        super(name, age, className);
        super.mID = "F_" + super.getID();
    }

    public void printOutfit() {
        System.out.println("Biała bluzka z krawatem, szkolna marynarka, granatowa spódniczka, płaskie obuwie.");
    }
}
