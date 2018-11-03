package Java基础.Stream;

/*
* lambda的好处   代码简洁\懒加载
*
* 函数式接口是什么?
*       首先它是一个接口, 有且只有一个抽象方法,这种接口叫做函数式接口
*
* Stream流是什么?
*   Stream（流）是一个来自数据源并支持聚合操作的元素队列; 元素队列就是一种函数模型不能称为数据结构,Stream流本身并不存储任何元素.
*
*抽象方法:
*   supplier中的抽象方法为get();
*   Predicate中的抽象方法为test(T t);   filter
*   Function中的抽象方法为apply(T t);   map
*   Consumer中的抽象方法为accept(T t);  foreach
*
*
延迟方法:返回值类型仍然是Stream 接口自身类型的方法，因此支持链式调用。
	1.过滤 	filter
		用到Predicate消费者接口
	2.取用	limit
		参数是long类型的数字.截取一个长度为n的流(n为负报异常,截取会执行到元素截取完为止)
	3.跳过	skip
		参数是long类型的数字.跳过n个元素后,返回流(n为负报异常,可以返回空流)
	4.映射	map
		用到Function接口
		<R> Stream<R> map(Function<? super T,? extends R> mapper)
	5.组合	concat(是静态方法,由Stream调用)         Stream.concat
		static	<T>	Stream<T>.concat(Stream<? extends T> a,Stream<? extends T>b)
	6.还有一些default定义的默认方法
	    Predicate  and()   negate()  or()
	    Function    compose()   andThen()
	    Consumer    andThen()

终结方法:返回值类型不再是Stream 接口自身类型的方法
	1.统计	count
		返回的是一个long类型的数字,代表流中元素个数
	2.遍历	forEach(不保证有序)
		该方法并不保证元素的逐一消费动作在流中是被有序执行的。
*
*
* */
public class Stream {
}
