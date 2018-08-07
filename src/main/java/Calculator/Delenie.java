package Calculator;

public class Delenie extends Operation {
    public Delenie() {
    }

    double getResult(double a, double b) throws myExeption {
        if (b != 0.0D) {
            return a / b;
        } else {
            throw new myExeption(0.0D);
        }
    }
}
