class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++){

            System.out.println("Thread running: "+ i);
        }
    }
    
}

class ThreadClass{

    public static void main(String[] args){
        MyThread t1 = new MyThread();  // create thread object
        t1.start();  // start thread - JVM calls run()

        // t1.run();   // It will simply run the run() method 
        for(int i = 1; i <= 5; j++){
            System.out.println("Main thread: "+ i);
        }
    }
}
