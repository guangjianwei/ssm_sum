/**
 * 文件解压缩
 * tar 代表打包后文件
 * gz  代表压缩后的文件
 * tar.gz 代表打包后的压缩文件
 *  mysql.tar
 *  mysql.tar.gz
 *
 * 解压 tar包
 * tar -xvf file.tar
 * 解压 tar.gz包
 * tar –zxvf  itheima.tar.gz
 *
 *
 * 删除文件和文件夹
 * 常规删除a.txt文件(只能删除文件)  会有提示
 * rm a.txt
 * 强行删除file.log文件(只能删除文件)   没有提示
 * rm -f file.log
 * 删除dirname文件夹   会有提示
 * rm -r dirname
 * 强制删除对应文件或者文件夹的所有东西   没有提示
 * rm -rf fileDirName
 *
 *
 *
 * 查看文件内容
 * cat     由第一行开始显示内容，并将所有内容输出
 * more    根据窗口大小，一页一页的现实文件内容
 * less    和more类似，但其优点可以往前翻页，而且进行可以搜索字符
 *
 * vim是文件编辑,对文件内容进行修改,也可以查看文件.
 *
 *
 *
 *
 *
 * 修改文件的权限命令
 * chmod 777 fileName       777代表三个分组 user用户  group分组   other其他     7 转换为2进制为 1 0 1 代表为 读 , 写 , 执行的权限
 * 根据以上分析还可以写为
 * chmod u=rwx,g=rx,o=rx fileName
 * chmod u=7,g=5,o=5 fileName
 *
 *
 * 在linux系统上发布一个项目步骤
 * 1.把数据库导入到linux中的数据库中
 * 2.把需要发布的项目放到linux中的tomcat中
 * 3.运行项目.
 *
 *  发布项目到linux中的tomcat中,因为tomcat的webapps文件中支持放war包.
 *  我们可以把target中编译出来的war包直接放过去, 也可以把我们window中的war包,直接拷贝到linux系统中去.
 */

public class linux {

}
