package Calculator;

abstract class Operation {
    Operation() {
    }

    double getResult(double a, double b) throws myExeption {
        return a + b;
    }
}
