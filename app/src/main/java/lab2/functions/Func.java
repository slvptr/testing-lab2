package lab2.functions;

public interface Func {
    double calc(double eps);

    void setX(double x);
    double getX();
    default double calc() {
        return calc(0.01);
    }
}
