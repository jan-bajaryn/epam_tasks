package by.epam.task04.ex4.example16.entity;

public class Pair {
    private Integer f;
    private Integer s;

    public Pair(Integer f, Integer s) {
        this.f = f;
        this.s = s;
    }

    public Integer getF() {
        return f;
    }

    public Integer getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "f=" + f +
                ", s=" + s +
                '}';
    }
}
