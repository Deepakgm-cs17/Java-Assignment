class coffeeMachine extends Thread{
    static boolean coffeeMade = false;
    static final Object lock = new Object();
    static int coffeeNumber = 0;

    public void run() {
        while (true) {
            makeCoffee();
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void makeCoffee() {
        synchronized (coffeeMachine.lock) {
            if (coffeeMade != false) {
                try {
                    coffeeMachine.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            coffeeMade = true;
            System.out.println("Coffee Machine : Coffee " + ++coffeeNumber + " is Ready.");
            coffeeMachine.lock.notifyAll();
            System.out.println("Coffee Machine: Notified waiter to pick " + coffeeNumber + " coffee.");
        }
    }
}

class waiter extends Thread{
    public void run() {
        while (true) {
            getCoffee();
        }
    }

    void getCoffee() {
        synchronized (coffeeMachine.lock) {
            if (coffeeMachine.coffeeMade == false) {
                System.out.println("Waiter : Waiting for Coffee machine to prepare  coffee.");
                try {
                    coffeeMachine.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Waiter : Coffee " + coffeeMachine.coffeeNumber + " taken from Coffee Machine.");
            coffeeMachine.coffeeMade = false;
            coffeeMachine.lock.notifyAll();
            System.out.println("Waiter: Coffee Machine prepare  Coffee.");
            System.out.println("#####################################################");
        }
    }
}

public class problemEight {
    public static void main(String[] args) {
    coffeeMachine work1 = new coffeeMachine();
    waiter work2 = new waiter();
    work1.start();
    work2.start();
    }
}
