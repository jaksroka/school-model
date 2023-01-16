package pl.edu.agh.wggios.school;

public class Main {
    public static void main(String[] args) {
        Pupil[] pupilTab = new Pupil[6];
        pupilTab[0] = new SchoolBoy("Ambroży Tyszkiewicz", 12, "6a");
        pupilTab[0].setNote(Subject.FIZYKA, 3.0);
        pupilTab[1] = new SchoolBoy("Gabriel Miller", 11, "6a");
        pupilTab[2] = new SchoolBoy("Oktawian Buczygród", 12, "6b");
        pupilTab[3] = new SchoolGirl("Cecylia Antosiewicz", 12, "6a");
        pupilTab[4] = new SchoolGirl("Anastazja Różańska", 12, "6b");
        pupilTab[5] = new SchoolGirl("Gaja Kamińska", 12, "6b");

        printAllPupils(pupilTab);

        Worker[] workerTab = new Worker[4];
        workerTab[0] = new Teacher("x", 40, 4500, Subject.FIZYKA, 12);
        workerTab[1] = new Teacher("y", 27, 4000, Subject.MATEMATYKA, 1);
        workerTab[2] = new Admin("z", 55, 4000, "Sekretarka");
        workerTab[3] = new Admin("t", 49, 3500, "Woźny");

        printAllWorkers(workerTab);
    }

    private static void printAllPupils(Pupil[] pupilTab) {
        for(int i=0; i<pupilTab.length; i++) {
            System.out.print(pupilTab[i]);
            pupilTab[i].printOutfit();
        }
    }

    private static void printAllWorkers(Worker[] workerTab) {
        for(Worker w: workerTab) {
            System.out.println(w);
        }
    }
}