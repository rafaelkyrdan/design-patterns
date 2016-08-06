package behavioral.patterns.command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * We create a thread pool with 10 threads.
 * Then, we set different behavioral.patterns.command objects with different jobs and add these jobs
 * to the queue using the addJob method of the ThreadPool class.
 * As soon as the job is inserted into the queue,
 * a thread executes the job and removes it from the queue.
 * <p>
 * ThreadPool class used to create pool of threads and allow
 * a thread to fetch and execute the job from the job queue.
 * Each worker thread will wait for a job in a queue and
 * then execute the job and will go back to waiting behavioral.patterns.state.
 */

public class ThreadPool {

    private final BlockingQueue<Job> jobQueue;
    private final Thread[] jobThreads;
    private volatile boolean shutdown;

    public ThreadPool(int n) {
        jobQueue = new LinkedBlockingQueue<>();
        jobThreads = new Thread[n];
        for (int i = 0; i < n; i++) {
            jobThreads[i] = new Worker("Pool Thread " + i);
            jobThreads[i].start();
        }
    }

    public void addJob(Job r) {
        try {
            jobQueue.put(r);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownPool() {

        while (!jobQueue.isEmpty()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        shutdown = true;
        for (Thread workerThread : jobThreads) {
            workerThread.interrupt();
        }
    }

    private class Worker extends Thread {

        public Worker(String name) {
            super(name);
        }

        public void run() {
            while (!shutdown) {
                try {
                    Job r = jobQueue.take();
                    r.run();
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
