class JoinMethod extends Thread{
    public void run() {
        try{

            for(int i=1; i<=5; i++){
                System.out.println("Sleep Count: " + i);
                Thread.sleep(2000,100);
            }
        } 
         catch (InterruptedException e) {
            System.out.println("Interrupted");
         }
    }
    
}
class JoinMethod {

    public static void main (String[]args) throws InterruptedException{

        joinThread t1 = new joinThread();
        t1.start();
        // t1.join();
        t1.join(millis: 5000);

        for(int i = 1; i<=5; i++){
          System.out.println("");
        }
    }
}
