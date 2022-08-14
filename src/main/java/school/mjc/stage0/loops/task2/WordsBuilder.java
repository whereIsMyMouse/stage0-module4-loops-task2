package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        if (chars.length == 0) {
            System.out.println("");
        } else {
            System.out.print(chars);
        }
    }
}
