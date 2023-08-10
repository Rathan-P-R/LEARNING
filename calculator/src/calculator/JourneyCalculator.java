 package calculator;

public class JourneyCalculator {
    public static void main(String[] args) {
        JourneyCalculatorApp journeyCalculator = new JourneyCalculatorApp();

        double distance = journeyCalculator.calculateDistance(60.0, 1.5);
        System.out.println("distance: " + distance);
    }
}

class JourneyCalculatorApp {

    public double calculateDistance(double speed, double time) {
        double distance = speed * time;
        return distance;
    }
}
