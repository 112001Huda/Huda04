package HandlingException.CheckedException;

public class InterruptedException {
    public static void main(String[] args) {
        Thread longsleepingThread = new Thread (() -> {
            try {
                System.out.println("sleep...");
                Thread.sleep(10000);
                Thread.currentThread().interrupt();
                System.out.println("wake up ");
            }
            catch (java.lang.InterruptedException e ) {
                throw new RuntimeException(e);
            }
        } );
        longsleepingThread.start();
        try {
            Thread.sleep(2000);
        }
        catch (java.lang.InterruptedException e ) {
            throw new RuntimeException(e) ;
        }
        longsleepingThread.interrupt();
    }
}
