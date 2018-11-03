package final用法.猫和老鼠的类转型案例;

public class test {
    public static void main(String[] args) {
//          Animals obj = new Dog();
           getPetAnimal(new Dog());    //参数是Animal类型，但是直接传入一个子类，
        System.out.println("============="); //也是可以的，因为这里面会把子类自动转换成是Animal
//        Animals obj1 = new Cat();
        getPetAnimal(new Cat());
    }

    public static void getPetAnimal(Animals animals) {
        if (animals instanceof Dog){
            Dog dog =(Dog) animals;
            System.out.println("狗:");
            dog.dogMathod();
        } else if (animals instanceof Cat) {
            Cat cat =(Cat) animals;
            System.out.println("猫:");
            cat.catMathod();
        }
    }
}
