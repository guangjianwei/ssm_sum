import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add( new Student("小宝",88,99));
        list.add(new Student("傻宝",85,78));
        list.add(new Student("臭宝",86,50));
       ArrayList<Student> result =getSum(list);
       new Student("小宝",88,99).show();
       new Student("傻宝",85,78).show();
       new Student("臭宝",86,50).show();
        for (int i = 0; i < result.size(); i++) {
            System.out.println("姓名"+result.get(i).getName());
            System.out.println("语文"+result.get(i).getChinese());
            System.out.println("数学"+result.get(i).getMath());
        }

    }
    public static  ArrayList<Student> getSum(ArrayList<Student> list){
        ArrayList<Student> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if((list.get(i).getMath()+list.get(i).getChinese()>160)){
                   list1.add(new Student(list.get(i).getName(),list.get(i).getChinese(),list.get(i).getMath()));
                }
            }
            return list1;
    }

}
