package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.print("");
        } else {
            int j = 2;
            while (j < printToInclusive) {
                int dividers = 1;
                int i = 2;
                while (i <= j) {
                    if (j % i == 0) {
                        dividers++;
                    }
                    i++;
                }
                if (dividers == 2) {
                    System.out.println(j);
                }
                j++;
            }
        }
    }
}
