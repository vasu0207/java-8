package main.java.dead_lock;

public class Counter  extends Thread{


    public void IncrementBallsAfterRun() {
        synchronized(Runs.class) {
            synchronized(Balls.class) {
                Runs.countRuns++;
                Balls.countBalls++;
            }
        }
    }

    public void IncrementRunAfterBalls() {
        synchronized(Balls.class) {
            synchronized(Runs.class) {
                Balls.countBalls++;
                Runs.countRuns++;
            }
        }
    }
    @Override
    public void run() {
        IncrementBallsAfterRun();
        IncrementRunAfterBalls();
    }
}
