package pl.edu.agh.wggios.school;

enum Subject {
    MATEMATYKA(0),
    FIZYKA(1),
    CHEMIA(2),
    INFORMATYKA(3),
    ANGIELSKI(4),
    NIEMIECKI(5),
    POLSKI(6);

    private final int idx;

    Subject(int idx) {
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }
}
