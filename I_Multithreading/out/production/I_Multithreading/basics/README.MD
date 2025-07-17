Here are **definitions with simple examples** for both:

---

### ✅ 1. **Thread by Extending the `Thread` Class**

#### 🔹 **Definition:**

Creating a thread by **extending the `Thread` class** means making your class a subclass of `Thread` and overriding its `run()` method to define what the thread will do.

#### 🔹 **Example:**

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create thread object
        t1.start(); // Start the thread
    }
}
```

> 🔸 Here, the thread code is inside the `run()` method, and `start()` is used to begin execution.

---

### ✅ 2. **Thread by Implementing the `Runnable` Interface**

#### 🔹 **Definition:**

Creating a thread by **implementing the `Runnable` interface** means defining the thread’s task inside the `run()` method, then passing that `Runnable` to a `Thread` object.

#### 🔹 **Example:**

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj); // Wrap Runnable in Thread
        t1.start(); // Start the thread
    }
}
```

> 🔸 This method is preferred in Java because it allows multiple inheritance (your class can still extend another class).

---

### ⚡ Summary:

| Method                | Flexibility | Best Practice   |
| --------------------- | ----------- | --------------- |
| `extends Thread`      | Less        | ❌ Not preferred |
| `implements Runnable` | More        | ✅ Preferred     |
---

### 🧵 **States of a Thread in Java**

A Java thread can be in **one of six states**, as defined in the `Thread.State` enum.

---

### 📘 **1. NEW**

* The thread is **created** but **not yet started**.
* You’ve written `Thread t = new Thread();` but haven’t called `t.start()` yet.

---

### 📘 **2. RUNNABLE**

* The thread is **ready to run** and **waiting for CPU time**.
* It may be actually **running** or just **waiting** in the runnable queue.

---

### 📘 **3. BLOCKED**

* The thread is **waiting to access a locked resource** (like synchronized code) used by another thread.

---

### 📘 **4. WAITING**

* The thread is **waiting indefinitely** for another thread to perform a specific action (like `notify()`).

---

### 📘 **5. TIMED\_WAITING**

* The thread is **waiting for a limited time**, like:

    * `sleep(ms)`
    * `join(ms)`
    * `wait(ms)`

---

### 📘 **6. TERMINATED (or DEAD)**

* The thread has **completed its task** or was **stopped** due to an error.

---



                +--------+
                |  NEW   |
                +--------+
                    |
                    | start()
                    v
               +-----------+
               | RUNNABLE  |<----------------+
               +-----------+                 |
                    |                        |
                    | gets CPU               | notify(), join() ends, sleep ends
                    v                        |
               +----------+                  |
               | RUNNING  |                  |
               +----------+                  |
              /     |   |   \                |
     sleep() /  wait()  \synchronized block  |
           v      v       v                  |
```
+----------------+  +--------+     +--------+
| TIMED_WAITING |  | WAITING|     | BLOCKED|
+----------------+  +--------+     +--------+
\            |              |
\           | notify()     |
\          +--------------+
|
| finishes or exits
v
+-----------+
| TERMINATED|
+-----------+
```
