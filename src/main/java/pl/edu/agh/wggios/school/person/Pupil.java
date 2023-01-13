package pl.edu.agh.wggios.school.person;

import pl.edu.agh.wggios.school.structure.SchoolClass;
import pl.edu.agh.wggios.school.grade.Grade;
import pl.edu.agh.wggios.school.grade.GradeList;
import pl.edu.agh.wggios.school.grade.Subject;
import pl.edu.agh.wggios.school.outfit.Outfit;

public abstract class Pupil extends Person implements Studentable {

    private static final int ID_LENGTH = 5;
    private static int idSequence = 1000;

    protected GradeList grades;
    protected SchoolClass schoolClass; //todo ogarnąć w setterach i kontruktorach

    private static synchronized String getNextId() {
        if (idSequence >= (10^ID_LENGTH)) {
            throw new RuntimeException("Id sequence exceeded");
        }
        return String.valueOf(idSequence++);
    }

    protected Pupil(String name, String surname, int age, Male male) {
        super(getIdPrefix(male)+getNextId(), name, surname, age, male);
        this.grades = new GradeList();
    }

    public void setGrade(Subject subject, Grade grade) {
        this.grades.setGrade(subject, grade);
    }

    public Grade getGrade(Subject subject) {
        return this.grades.getGrade(subject);
    }

    public double getGradesAverage() {
        return this.grades.getAvg();
    }

    public void clearGrades() {
        this.grades.clear();
    }

    public abstract Outfit getOutfit();

    private static String getIdPrefix(Male male) {
        return male.getShortName() + "_";
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gradeAverage='" + this.getGradesAverage() + '\'' +
                ", class='" + this.schoolClass.getName() + '\'' +
                ", age=" + age +
                ", outfit=" + this.getOutfit().toString() +
                '}';
    }
}
