Here are the most important **Thread Methods in Java**, explained simply with examples:

---

### 🧵 **Common Java Thread Methods**

| Method            | Description                                              |
| ----------------- | -------------------------------------------------------- |
| `start()`         | Starts the thread (calls `run()` method in a new thread) |
| `run()`           | Contains the code that runs when the thread starts       |
| `sleep(ms)`       | Pauses the thread for a given time (in milliseconds)     |
| `join()`          | Waits for a thread to finish                             |
| `isAlive()`       | Checks if the thread is still running                    |
| `getName()`       | Returns the thread's name                                |
| `setName(name)`   | Sets the thread's name                                   |
| `setPriority(p)`  | Sets the thread's priority (1 to 10)                     |
| `getPriority()`   | Returns the thread's priority                            |
| `yield()`         | Pauses current thread to give chance to others           |
| `interrupt()`     | Interrupts a sleeping or waiting thread                  |
| `isInterrupted()` | Checks if the thread is interrupted                      |

---

### 🔍 **Simple Example Using Key Thread Methods**

```java
public class ThreadExample extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            Thread.sleep(1000);  // TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample();
        t1.setName("MyThread");
        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Before start, isAlive: " + t1.isAlive());
        t1.start();  // Starts the thread

        t1.join();  // Main thread waits for t1 to finish

        System.out.println("After join, isAlive: " + t1.isAlive());
    }
}
```

---

