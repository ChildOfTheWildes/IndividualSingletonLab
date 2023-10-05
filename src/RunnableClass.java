import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Constructor;

public class RunnableClass implements Runnable {

    private Thread t; // Stores and instance of a thread

    private String threadName; // the name of the thread

    public RunnableClass(String name) {

        threadName = name;
        System.out.println("Creating " + threadName);

    }

    public void run() {

        System.out.println("Running " + threadName);

        System.out.println("Creating Singleton for thread " + threadName);

        // Creates the singleton instance.
        LazyInitializedSingleton theOnlyOne = LazyInitializedSingleton.getInstance();
        // theOnlyOne.hashcode prints the hashcode out of the instance created above
        System.out.println(threadName + " hashcode is " + theOnlyOne.hashCode());

    }

    public void start() {
        System.out.println("Starting " + threadName);
        // If the thread doesn't exist, create a thread and put it in t
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }



}
