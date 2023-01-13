package pl.edu.agh.wggios.school.grade;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GradeList {

    private final Map<Subject, Grade> grades;

    public GradeList() {
        this.grades = Arrays.stream(Subject.values()).collect(Collectors.toMap(Function.identity(), s -> Grade.NULL));
    }

    public Grade getGrade(Subject subject) {
        return this.grades.get(subject);
    }

    public void setGrade(Subject subject, Grade grade) {
        grades.put(subject, grade);
    }

    public double getAvg() {
        return grades.values().stream()
                .map(Grade::toNumericalValue)
                .reduce(Double::sum)
                .get() / grades.size();
    }

    public void clear() {
        this.grades.keySet().forEach(k -> this.grades.put(k, Grade.NULL));
    }
}
