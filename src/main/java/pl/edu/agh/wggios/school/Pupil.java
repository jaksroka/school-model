package pl.edu.agh.wggios.school;

public abstract class Pupil extends Person {

    private final static int SUB_NO = 7;
    private static int ID = 1000;

    private String mClassName; // np.2d
    private double mAve;
    private double mNotes[] = new double[SUB_NO];
    protected String mID;

    public Pupil(String name, int age, String className) {
        super(name, age);
        mID = Integer.toString(ID++);
        clearNotes();
        mClassName = className;
    }

    public void clearNotes() {
        for (int i=0; i<SUB_NO; i++)
            mNotes[i] = 0;
        mAve = 0;
    }

    public double calcAve() {
        double sum = 0;
        for(int i=0; i<SUB_NO; i++)
            sum += mNotes[i];
        this.mAve = sum / SUB_NO;
        return mAve;
    }

    public void setNote(Subject subj, double note) {
        this.mNotes[subj.getIdx()] = note;
        calcAve();
    }

    public double getNote(Subject subj) {
        return this.mNotes[subj.getIdx()];
    }

    public double getAve() {
        return mAve;
    }

    public String getID() {
        return mID;
    }

    abstract public void printOutfit(); //drukowanie ubioru

    @Override
    public String toString() {
        return mID + '\t' +
               getName() + '\t' +
               getAve() + '\t' +
               mClassName + '\t' +
               getAge() + '\t';
    }
}
