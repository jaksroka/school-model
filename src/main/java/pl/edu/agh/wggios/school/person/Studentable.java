package pl.edu.agh.wggios.school.person;

import pl.edu.agh.wggios.school.grade.Grade;
import pl.edu.agh.wggios.school.grade.Subject;
import pl.edu.agh.wggios.school.outfit.Outfit;

public interface Studentable {

    void setGrade(Subject subject, Grade grade);

    Grade getGrade(Subject subject);

    double getGradesAverage();

    void clearGrades();

    Outfit getOutfit();
}
