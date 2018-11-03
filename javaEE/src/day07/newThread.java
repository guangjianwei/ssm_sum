package day07;

public class newThread {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开启一个线程");
        }).start();
        getTeacher(()->{
            System.out.println("教书育人");
        });

    }
    public static void getTeacher(Teacher teacher){
        teacher.teacher();
    }
}
