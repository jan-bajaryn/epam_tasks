package by.epam.learn.task1.linear.example3.ex30;

public class Resistance {
    public double resistance(double r1, double r2, double r3){
        if (r1<=0 || r2 <=0 || r3 <=0)
            throw new IllegalArgumentException("resistance can't be less or equal 0");
        return  1/(1/r1 + 1/r2 + 1/r3);
    }
}
