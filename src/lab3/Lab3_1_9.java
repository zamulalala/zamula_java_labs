package lab3;

public class Lab3_1_9 {

    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1, 2, -3.0);
        QuadraticEquation q2 = new QuadraticEquation(10, 12, -100);
        QuadraticEquation[] array = new QuadraticEquation[]{q1, q2};

        System.out.println("Максимальный корень = " + String.format("%.4f", findMaxRoot(array)));
        System.out.println("Минимальный корень = " + String.format("%.4f", findMinRoot(array)));
    }


    public static double findMaxRoot(QuadraticEquation[] array) {
        double currentMaxRoot = Double.NEGATIVE_INFINITY;

        for (QuadraticEquation quadraticEquation : array) {
            double[] currentRoots = quadraticEquation.findRoot();
            for (double currentRoot : currentRoots) {
                if (currentRoot > currentMaxRoot) {
                    currentMaxRoot = currentRoot;
                }
            }
        }
        return currentMaxRoot;
    }

    public static double findMinRoot(QuadraticEquation[] array) {
        double currentMinRoot = Double.POSITIVE_INFINITY;

        for (QuadraticEquation quadraticEquation : array) {
            double[] currentRoots = quadraticEquation.findRoot();
            for (double currentRoot : currentRoots) {
                if (currentRoot < currentMinRoot) {
                    currentMinRoot = currentRoot;
                }
            }
        }
        return currentMinRoot;
    }
}
