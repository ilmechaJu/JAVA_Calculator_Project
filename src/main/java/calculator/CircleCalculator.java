package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator {
    private static final double PI = 3.14159;
    private Queue<Double> results;

    public CircleCalculator() {
        results = new LinkedList<>();
    }

    public double calculateCircleArea(int radius) {
        double area = radius * radius * PI;
        results.add(area);
        System.out.println("원의 넓이: " + area);
        return area;
    }

    public Queue<Double> getResults() {
        return results;
    }

    public void setResults(Queue<Double> queue) {
        this.results = queue;
    }

    public double removeResult() {
        return this.results.poll();
    }

    public String inquiryResults() {
        return this.results.toString();
    }
}
