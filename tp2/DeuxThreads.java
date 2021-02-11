package tp2;

public class DeuxThreads extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            System.out.println("Nouveau thread");
        }
    }

    public static void main(String[] args){
        DeuxThreads tt = new DeuxThreads();
        tt.start();
        Thread.currentThread().setName("Nom1");
        for (int i = 0; i < 1000; i++){
            System.out.println("Thread principal " + Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
