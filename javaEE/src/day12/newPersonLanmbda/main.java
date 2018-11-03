package day12.newPersonLanmbda;
//构造方法的引用
public class main {
    public static void main(String[] args) {
        mainBuild((n)->{
            return new Person(n);
        },"傻逼宝");
        mainBuild(Person::new,"帅见见");
    }
    public static void mainBuild(builderPerson bp,String name){
      Person p = bp.builderPerson(name);
        System.out.println(p.name);
    }
}
