package assignments;

public class twothreads {
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int j = 1; j <= 10; j++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(j);
                }
            }
        };
        th.start();
        th2.start();
    }
}
            