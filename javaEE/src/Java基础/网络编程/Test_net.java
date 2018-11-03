package Java基础.网络编程;

/*
*网络编程三要素
* 1.IP地址
* 2.端口号
* 3.协议
*
* TCP和UDP的区别
   UDP：面向无连接协议
   特点：
        1. 把数据打包
        2. 数据有限制（64K）
        3. 不会建立连接
        4. 速率快
        5. 不可靠（不安全）

    TCP：面向连接协议
    特点：
        1. 建立连接通信（三次握手）
        2. 数据无限制
        3. 速度慢
        4. 可靠（安全）

    TCP通信程序
        TCP通信的两端，严格区分客户端和服务端
    两端通信时步骤：
        服务器程序需要事先启动，等待客户端连接
        客户端主动连接服务端，连接成功才能通信
        服务端不能主动连接客户端
*
* */
public class Test_net {
}
