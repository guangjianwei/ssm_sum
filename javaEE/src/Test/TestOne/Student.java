package Test.TestOne;

public class Student extends Person{
    public Student() {
        super();
    }

    public Student(String name,int age){
        super(("学生："+name),age);
    }


    @Override
    public void work() {

    }
}
