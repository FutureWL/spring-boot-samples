package io.github.futurewl;

public class UnsafeSequence {

    private int value;

    public
//    synchronized
    int getNext() {
        return value++;
    }

    public static void main(String[] args) {
        UnsafeSequence unsafeSequence = new UnsafeSequence();
        new MyThread("Thread-1", unsafeSequence).start();
        new MyThread("Thread-2", unsafeSequence).start();
        new MyThread("Thread-3", unsafeSequence).start();
        new MyThread("Thread-4", unsafeSequence).start();
        new MyThread("Thread-5", unsafeSequence).start();
        new MyThread("Thread-6", unsafeSequence).start();
        new MyThread("Thread-7", unsafeSequence).start();
        new MyThread("Thread-8", unsafeSequence).start();
        new MyThread("Thread-9", unsafeSequence).start();
        new MyThread("Thread-10", unsafeSequence).start();

    }


}

class MyThread extends Thread {
    private UnsafeSequence unsafeSequence;

    public MyThread(String name, UnsafeSequence unsafeSequence) {
        super(name);
        this.unsafeSequence = unsafeSequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + unsafeSequence.getNext());
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
        }
    }
}
