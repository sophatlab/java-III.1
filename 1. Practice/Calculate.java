public class Calculate {
    int a;
    int b;

    public void add() {
        System.out.println("Sum: " + (a + b));
    }

    public void minus() {
        System.out.println("Minus: " + (a - b));
    }

    public void multiply() {
        System.out.println("Multiply: " + (a * b));
    }

    public void divide() {
        System.out.println("Divide: " + (a / b));
    }


    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.a = 10;
        calc.b = 5;

        calc.add();
        calc.minus();
        calc.multiply();
        calc.divide();
    }
}