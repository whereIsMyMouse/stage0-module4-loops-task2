package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int numberEven = 2;
        while (numberEven <= printTillInclusive){
            System.out.println(numberEven);
            numberEven = numberEven + 2;
        }

    }
}
