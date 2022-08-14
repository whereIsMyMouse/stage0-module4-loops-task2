package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplier = 0;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
            while (multiplier <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(multiplier * multiplyByAndToInclusive);
                multiplier++;
            }
        }
    }
}


