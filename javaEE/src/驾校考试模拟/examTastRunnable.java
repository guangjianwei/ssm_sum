package 驾校考试模拟;

public class examTastRunnable implements Runnable{
    Object lock;
    int count=0;//记录已经考试的人数
    @Override
    public void run() {
        exam();

    }
    public void exam(){
        synchronized (lock){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("正在考试");
            System.out.println("已经考试完毕！");
            System.out.println("目前已考人数:"+(count++));


        }
    }
}
