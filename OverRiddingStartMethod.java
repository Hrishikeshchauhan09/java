
class OverRiddingStart extends Thread {
    public void start() {
        // super.start();
        System.out.println("Running Start Method: ");
    }

    public void run() {
        System.out.println("Running Run Method: ");
    }
}


class OverRiddingStartMethod {

    public static void main(String[] args) {
        OverRiddingStart t1 = new OverRiddingStart();  // create 
        t1.start();
        //t1.run();
        System.out.println("Main thread: ");
    }
    
}
