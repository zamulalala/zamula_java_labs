package Lab5;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public QuadraticEquation(double a) {
        this.a = a;
        this.b = 0;
        this.c = 0;
    }

    public double[] findRoot(){
        double discriminant = b * b - 4 * a * c;
        if (a == 0 || discriminant < 0) {
            return new double[0]; // возвращаем пустой массив для комплексных корней
        }
        if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{root1, root2};

    }

    public double[] findExtrema() {
        if (a == 0) {
            return new double[0];
        }
        double x = -b / (2 * a);
        double y = a * x * x + b * x + c;
        return new double[]{x, y};
    }

    public void findIntervals() {
        if (a == 0) {
            if (b > 0) {
                System.out.println("Функция возрастает при любом значении х");
            } else if (b < 0) {
                System.out.println("Функция убывает при любом значении х");
            } else {
                System.out.println("Функция не имеет интервалов возрастания и убывания");
            }
        } else {
            double x = -b / (2 * a);
            if (a > 0) {
                System.out.println("Функция убывает в промежутке x < " + x);
                System.out.println("Функция возрастает в промежутке x > " + x);
            } else {
                System.out.println("Функция возрастает в промежутке x < " + x);
                System.out.println("Функция убывает в промежутке x > " + x);
            }


        }
    }

}




