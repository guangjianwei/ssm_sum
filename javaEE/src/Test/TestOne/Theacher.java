package Test.TestOne;

public class Theacher extends Person {
    public Theacher() {
        super();
    }

    public Theacher(String name,int age){
        super(("老师："+name),age);
    }
    @Override
    public void work() {

    }

}
