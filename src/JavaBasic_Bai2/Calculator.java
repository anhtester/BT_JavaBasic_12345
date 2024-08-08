package JavaBasic_Bai2;

public class Calculator {
int a = 10;
//    int b = 80;
//    int s = a + b;
//
//    double c = 9.7;
//    double d = 7.9;
//    double x = c * d;

    public int cong2So(int a, int b) {
        return (a + b);
    }

    public double tich2SoThuc(double a, double b) {
        return (a * b);
    }

    public static void main(String[] agrs) {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.s);
//        System.out.println(calculator.x);

        System.out.println(calculator.cong2So(15, 25));
        System.out.println(calculator.tich2SoThuc(5, 20));
    }
}
