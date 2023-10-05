public class Main {

    public static void main(String[] args) {

        //!!! Create loop here !!!



        RunnableClass rc1 = new RunnableClass("Thread 1");

        RunnableClass rc2 = new RunnableClass("Thread 2");

        RunnableClass rc3 = new RunnableClass("Thread 3");

        rc1.start();
        rc2.start();
        rc3.start();

    }

}
