package org.whole.crossexamples.cg12.mps;


public class MPSDemo1SampleReduced {

    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        for (int INDEX = start; INDEX < end + 1; INDEX++) {
            System.out.println("Hi! " + INDEX);
        }
        for (int i = 0; i < 10; i++) {
            String message = createMessage();
            System.out.println(message);
        }
    }

    private static String createMessage() {
        return "Hello world!";
    }
}
