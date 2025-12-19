
class RunOverload extends Thread {
    public void run() {
        System.out.println("Run method parameters: ");
    }

    public void run(int i) {
        System.out.println("Run method with parameter: "+ i);
    }
}

class OverloadingRunMethod {

    public static void main(String[] args) {
        RunOverload t1 =new RunOverload();  // create thread object
        // t1.start();  // It will run the run() method of without

        // t1.run();   // It will simply run the run() method 
        t1.run(10);

        System.out.println("Main thread: ");
    }
    
}
