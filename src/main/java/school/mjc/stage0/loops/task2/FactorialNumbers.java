package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            int i = 1;
            int factorial = 1;
            while (i <= printToInclusive+1) {
                System.out.println(factorial);
                factorial = factorial * i;
                i++;
            }
        }

    }
}
