package tomcat;


/**
 * 1.Tomcat的目录对应的作用
 * lib			jar包目录
 * webapps		项目发布目录
 * conf		配置文件
 * work		是tomcat的工作目录，也就是tomcat把jsp转换为class文件的工作目录。
 * 当客户端第一次访问jsp时tomcat会在work目录里把这个jsp页面转换成.java文件，比如将index.jsp转换为index_jsp.java文件，
 * 而后编译为index_jsp.class文件，
 * 最后tomcat容器通过ClassLoader类把这个index_jsp.class类装载入内存，响应客户端。以后的每次访问不需要再转换和编译，
 * 这也是为什么第一次访问很慢，后面访问会很快的原因.
 * tomcat会定时扫描webapp文件夹/项目名下面的jsp文件（jsp原文件），
 * 并读取jsp原文件的最新修改时间当发现某个jsp文件发生改变时（文件的最后修改时间与上次扫描时间不一致时），
 * tomcat会重新转换、编译这个jsp文件。
 *
 * 2.http协议
 * HTTP协议是Web应用所使用的主要协议
 * HTTP协议是一种超文本传输协议（Hypertext Transfer Protocol），是基于请求/响应模式的
 * HTTP是无状态协议
 * HTTP的请求和响应消息如果没有发送并传递成功的话，HTTP不会保存已传递的信息
 */
public class TomcatDemo {
}
