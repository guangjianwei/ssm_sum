package 成员内部类;

public class Body {
    int num = 10;
    public class Heart{
        int num =20;
        public void beat(){
            int num =30;
            System.out.println("心脏在跳动");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }
    public  void bodyHeap(){
        new Heart().beat();
    }
}
