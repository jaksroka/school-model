package pl.edu.agh.wggios.school.person;

public enum Male {
    MALE("M"),
    FEMALE("F");

    private String shortName;

    Male(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
