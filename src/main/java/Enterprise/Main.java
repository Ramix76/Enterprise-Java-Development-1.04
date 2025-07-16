package Enterprise;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 5, 8};
        double x = 3;
        double y = 10;

        System.out.println();
        System.out.println("Difference between 2 numbers:");

        int res = Difference.maxMinDifference(numbers);
        System.out.println("Result: " + res);

        System.out.println();
        System.out.println("2 smallest numbers:");

        int[] result = SmallestElements.findTwoSmallest(numbers);
        System.out.println("Mín: " + result[0]);
        System.out.println("Second mín: " + result[1]);

        System.out.println();
        System.out.println("Math equation:");
        double equationResult = MathEquation.calculate(x, y);
        System.out.println("Result: " + equationResult);

    }
}
