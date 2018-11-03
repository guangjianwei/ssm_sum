package 形参和返回值的练习.demo02;
/*
1.需求说明：定义方法,传递三个图书类对象，找出价格最高的图书并返回该图书的对象,调用方法并打印图书信息。
2.设计“图书类”Book，要求有以下属性：
	图书编号：
	书名：
	价格：
 */
public class demo02 {
    public static void main(String[] args) {
        Book oneBook =new Book(1002,"琅琊榜",40);
        Book twoBook =new Book(1003,"美人鱼",50);
        Book threeBook =new Book(1004,"封神榜",60);
        Book book = getBook(oneBook,twoBook,threeBook);
        System.out.println("最高价格的图书显示为：");
        System.out.println("书名："+book.getNameBook());
        System.out.println("编号："+book.getNumBook());
        System.out.println("价格："+book.getPriceBook());
    }
    public static Book getBook(Book one,Book two,Book three){
        double max = one.getPriceBook()>two.getPriceBook()?one.getPriceBook():two.getPriceBook();
        max = max>three.getPriceBook()?max:three.getPriceBook();
        if(max == one.getPriceBook()){
            return one;
        }else if(max == two.getPriceBook()){
            return two;
        }else{
            return three;
        }
    }
}
