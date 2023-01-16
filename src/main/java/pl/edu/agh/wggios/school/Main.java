package pl.edu.agh.wggios.school;

public class Main {
    public static void main(String[] args) {
        Pupil[] pupilTab = new Pupil[6];
        pupilTab[0] = new SchoolBoy("Ambroży Tyszkiewicz", 12, "6a");
        pupilTab[1] = new SchoolBoy("Gabriel Miller", 11, "6a");
        pupilTab[2] = new SchoolBoy("Oktawian Buczygród", 12, "6a");
        pupilTab[3] = new SchoolGirl("Cecylia Antosiewicz", 12, "6a");
        pupilTab[4] = new SchoolGirl("Anastazja Różańska", 12, "6a");
        pupilTab[5] = new SchoolGirl("Gaja Kamińska", 12, "6a");

        printAllPupil(pupilTab);
    }

    private static void printAllPupil(Pupil[] pupilTab) {
        for(int i=0; i<pupilTab.length; i++) {
            System.out.print(pupilTab[i]);
            pupilTab[i].printOutfit();
        }
    }
}