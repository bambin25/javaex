package thread;

public class TreadDemo4 {
  public static void main(String[] args) {
    // 왜 비교하는거지 차이가 뭐지
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        Thread ct = Thread.currentThread();
        ct.setPriority(1);
        System.out.println(ct.getName() + "," + ct.getPriority());
      }
    });
    thread.start(); // thread.run(); 비교
    new Thread(new Runnable() {
      @Override
      public void run() {
        Thread ct = Thread.currentThread();
        ct.setPriority(1);
        System.out.println(ct.getName() + "," + ct.getPriority());
      }
    }).start();

    Thread ct = Thread.currentThread();
    ct.setPriority(10);
    System.out.println(ct.getName() + "," + ct.getPriority());
  }
}
