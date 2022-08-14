package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int numberActual = 0;
        while (numberActual <= lastPrinted){
            System.out.println(numberActual);
            numberActual++;
        }
    }
}
