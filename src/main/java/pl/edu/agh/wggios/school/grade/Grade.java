package pl.edu.agh.wggios.school.grade;

import java.util.function.Function;

public enum Grade {
    NULL(0.0),
    NDST(2.0),
    DST(3.0),
    DST_PLUS(3.5),
    DB(4.0),
    DB_PLUS(4.5),
    BDB(5.0);

    private double numericalValue;

    Grade(double numericalValue) {
        this.numericalValue = numericalValue;
    }

    public static double toNumericalValue(Grade grade) {
        return grade.numericalValue;
    }

    public static Grade fromNumericalValue(double numericalValue) {
        for (Grade grade : Grade.values()) {
            if (grade.numericalValue == numericalValue) {
                return grade;
            }
        }
        return null;
    }
}
