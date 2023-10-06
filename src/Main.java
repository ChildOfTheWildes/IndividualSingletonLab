public class Main {

    public static void main(String[] args) {

        // Creates and names instance RunnableClass and starts it.
        for (int i = 3; i > 0; i--) {
            RunnableClass rc = new RunnableClass("Thread " + i);
            rc.start();
        }

    }

}
