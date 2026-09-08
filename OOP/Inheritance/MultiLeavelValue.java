package Inheritance;

class Value {
    int x, y;

    void setValue(int a, int b) {
        x = a;
        y = b;
    }
}

class Add extends Value {
    int getAdd() {
        return x + y;
    }
}

class Mul extends Value {
    int getMul() {
        return x * y;
    }
}

class Div extends Value {
    int getDiv() {
        return x / y;
    }
}

public class MultiLeavelValue {
    public static void main(String[] args) {

        Add a = new Add();
        a.setValue(10, 10);
        System.out.println("Addition = " + a.getAdd());

        Mul m = new Mul();
        m.setValue(5, 4);
        System.out.println("Multiplication = " + m.getMul());

        Div d = new Div();
        d.setValue(40, 2);
        System.out.println("Division = " + d.getDiv());
    }
}
