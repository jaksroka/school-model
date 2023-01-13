package pl.edu.agh.wggios.school.structure;

import pl.edu.agh.wggios.school.person.Pupil;
import pl.edu.agh.wggios.school.person.Teacher;

import java.util.List;

public class SchoolClass {

    private String name;
    private Teacher supervisingTeacher;
    private List<Pupil> studentList;

    public String getName() {
        return name;
    }

}
