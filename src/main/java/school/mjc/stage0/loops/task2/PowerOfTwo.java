package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int numberActual = 0;
            while (numberActual <= power) {
                System.out.println((int) Math.pow(2, numberActual));
                numberActual++;
            }
        }
    }
}
