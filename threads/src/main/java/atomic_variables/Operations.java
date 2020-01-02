package main.java.atomic_variables;

public class Operations extends Thread {

    public void getAndIncrement(){

       Counter.normalVariable++;
        Counter.atomicInteger.getAndIncrement();
        System.out.println(Thread.currentThread().getName()+"\n \t notmal Variable : " + Counter.normalVariable + " atomicInteger Variable : " + Counter.atomicInteger);

    }

    public void getAndDecrement(){
        System.out.println("notmal Variable : " + Counter.normalVariable);
        Counter.normalVariable--;
        System.out.println("Atomic Variable : " + Counter.atomicInteger.getAndDecrement());
    }

    @Override
    public void run() {
        getAndIncrement();

        getAndDecrement();
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Entered Main");
        Operations op = new Operations();
        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Operations.run : normal - " + Counter.normalVariable +", atomic Integer : " + Counter.atomicInteger);
        System.out.println("Exist Main");
    }
}
