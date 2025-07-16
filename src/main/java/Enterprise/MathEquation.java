package Enterprise;

public class MathEquation {
    public static double calculate(double x, double y) {
        double part1 = x * x;
        double part2 = ((4 * y) / 5.0) - 5;
        double result = part1 + (part2 * part2);
        return result;
    }
}
