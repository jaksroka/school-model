package pl.edu.agh.wggios.school;

public abstract class Pupil extends Person {

    private final static int SUB_NO = 7;

    private String mClassName; // np.2d
    private double mAve;
    private double mNotes[] = new double[SUB_NO];
    protected String mID;
    private static int ID = 1000;

    public Pupil(String name, int age, String className) {
        super(name, age);
        mID = Integer.toString(ID++);
        clearNotes();
        mClassName = className;
    }

    public void clearNotes() {
        for (int i=0; i<SUB_NO; i++)
            mNotes[i] = 0;
    }

    public double calcAve() {
        double sum = 0;
        for(int i=0; i<SUB_NO; i++)
            sum += mNotes[i];
        return sum / SUB_NO;
    }

    public void setNote(Subject subj, double note) {
        this.mNotes[subj.ordinal()] = note;
    }

    public double getNote(Subject subj) {
        return this.mNotes[subj.ordinal()];
    }

    public double getAve() {
        return mAve;
    }

    public String getID() {
        return mID;
    }

    abstract public void printOutfit(); //drukowanie ubioru

}
