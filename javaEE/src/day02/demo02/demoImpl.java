
package day02.demo02;

public class demoImpl<MVP> {
    MVP mvp;
    MVP mvp1;
    int age;
    public demoImpl(MVP mvp,MVP mvp1,int age){
        this.mvp = mvp;
        this.age =age;
        this.mvp1=mvp1;
    }
    public <T> void get(T t){
        this.age=(int)t;
        System.out.println(age);
    }
}
