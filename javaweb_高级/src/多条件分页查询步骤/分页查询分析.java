package 多条件分页查询步骤;

/**
 * 需要的四个参数,以及分析
 1.要查国内游,别的旅游路线不看,   游览的类别				不知道游览的类别,把全部都显示出来了,是我需要的效果吗?
 2.当前是第几页					 页码					每一种分类都会有很多数据,那么我一次全都展示吗?   全展示界面会特别卡,而且用户也比较容易乱
 3.每页显示几条数据				 rows					正常在公司,项目经理来定,每页显示多少数据.
 4.通过路线名称查询				 路线名称				通过路线名称来查询数据, 不是必须的参数, 没有你,我也会去查询.

 逻辑:
 (1)html界面
 在页面加载完成之后,通过ajax请求,去后台请求求数据,需要带上对应的参数,

 (2)servlet中	对数据进行获取和封装的
 cid  这个分类是肯定存在.
 currentIndex.   可能不存在  			不存在,肯定是第一次进入此界面,那么默认是第一页,   如果有页码,那么就使用对应的页码.
 rows	可能不存在						不存在,需要使用我们定义的默认值,	如果存在,那么就用你穿进来的值为准.
 rname	可能不存在						不存在,不需要去操作,把它设置为""即可,	如果存在,需要对sql查询语句进行拼接,然后才能查询

 (3)service中	对dao层进行数据获取,然后对返回结果进行封装,封装成一个pageBean.
 这一步是dao中的操作
 总记录数			int 或者是long    		是不是通过select count(*) from tableName where 1 = 1  条件需要动态的拼接
     1.cid	 肯定存在,必须要拼接上去
     2.rname  如果存在需要拼接上去
     总页数				总记录数 /  每页的条目    动态计算出来的    对每页的条目取模  如果为 0  就是商   如果不为 0   就是 商 + 1
     每页的条目数		servlet传递过来的并且经过servlet处理后的	rows
     当前页码			servlet传递过来的并且经过servlet处理后的	currentIndex
     这一步是dao中的操作
     当前页的详细信息	List<T>		selet * from tableName where 1 = 1  条件需要动态的拼接		limit	分页查询的条件(开始索引,每页查询的数据)
     动态拼接sql语句的同时,也需要把对应的参数拼接到list集合中去,拼接完成后,转换为数组,作为参数参与查询.
     1.cid	 肯定存在,必须要拼接上去
     2.rname  如果存在需要拼接上去
     3.开始索引计算   (currentIndex - 1) * rows
     必须做判断	currentIndex >= 1	因为当前的页码不可能为负数
     还需要判断 	currentIndex <= totalPage   因为当前的页码不可能
     4.每页查询的数据	传递过来的rows

 (4)数据返回给html界面
 service封装数据已经完成
 就可以把对应的pageBean返回给Html界面,让界面进行展示,还是通过json字符串的格式

 结果:
 PageBean<T>
 总记录数						是不是通过selet count(*) from tableName where  查询条件			查到了总记录数
 总页数							通过总记录数 /  每页的条目    动态计算出来的    对每页的条目取模  如果为 0  就是商   如果不为 0   就是 商 + 1
 每页的条目数					参数定义好的,保存进来就行
 当前页码						前台传递过来的参数,直接保存
 当前页的详细信息				需要通过dao层,做数据库的查询selet * from tableName where  查询条件		查到了当前的详细信息


 注意细节:
 selet * from tableName where 1 = 1     为什么我们使用 1 = 1,因为 1 = 1的结果为一个true,不会影响我们后续的结果查询
 所以定义sql模版并不是规定死 1 = 1 ,  只要是true的判断语句都可以
 例如:
 selet * from tableName where true
 */

public class 分页查询分析 {
}
