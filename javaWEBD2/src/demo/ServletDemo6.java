package demo;

import utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
@WebServlet("/ServletDemo6")
public class ServletDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //文件下载
        //1.获取到参数值
        String filename = request.getParameter("filename");
        System.out.println(filename);
        //2.获取到真实路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/"+filename);
        FileInputStream fis = new FileInputStream(realPath);
        //3.设置响应头类型
        String mimeType = servletContext.getMimeType(filename);//获取文件的mime类型
        response.setHeader("content-type",mimeType);
        //设置响应头的打开方式 content-disposition  （这样才能够使浏览器打开的是下载的提示，还是直接打开）
        //3.1解决中文文件名乱码的问题
            //获取user-agent请求头
        String agent = request.getHeader("user-agent");
              //使用工具类编码文件名
        String fileName = DownLoadUtils.getFileName(agent, filename);
        response.setHeader(" content-disposition","attachment;filename="+filename);
        ServletOutputStream ops = response.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024*8];
        while((len = fis.read(bytes))!=-1){
            ops.write(bytes,0,len);

        }
        fis.close();
    }
}
