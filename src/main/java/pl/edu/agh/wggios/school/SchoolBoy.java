package pl.edu.agh.wggios.school;

public class SchoolBoy extends Pupil {

    public SchoolBoy(String name, int age, String className) {
        super(name, age, className);
        super.mID = "M_" + super.getID();
    }

    public void printOutfit() {
        System.out.println("Biała koszula z krawatem, szkolna marynarka, półbuty, spodnie grantowe.");
    }
}
