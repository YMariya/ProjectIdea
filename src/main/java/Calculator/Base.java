package Calculator;

public class Base {
    public Base() {
    }

    public static void base() throws myExeption {
        System.out.print("Введите 1-ое число: ");
        double a = Input.doubleNum();
        System.out.print("Введите арифметическую операцию +,-,*,/: ");
        char oper = Input.operation();
        System.out.print("Введите 2-ое число: ");
        double b = Input.doubleNum();
        System.out.println("------------ИТОГО------------");
        Operation calc;
        switch(oper) {
            case '*':
                calc = new Mult();
                System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                break;
            case '+':
                calc = new Sum();
                System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                break;
            default:
                calc = new Sum();
                System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                break;
            case '-':
                calc = new Minus();
                System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                break;
            case '/':
                calc = new Delenie();
                System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
        }

    }
}
