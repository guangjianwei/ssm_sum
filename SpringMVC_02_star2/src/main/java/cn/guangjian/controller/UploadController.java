package cn.guangjian.controller;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {
    /**
     * 原始的文件上传
     * @param
     * @return
     */
    @RequestMapping("/fileupload")
    public String  fileupload(HttpServletRequest request) throws Exception {
        System.out.println("fileupload方法执行了...");
        //先获取要上传的文件目录
        String realPath = "H:\\updates";
        //创建file对象，一会儿向该路径下上传文件
        File file = new File(realPath);
        //首先判断该路径是否存在，如果不存在创建该路径
        if (!file.exists()) {
            file.mkdirs();
        }
        //创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        //解析request对象
        List<FileItem> list = fileUpload.parseRequest(request);
        //遍历
        for (FileItem fileItem : list) {
            //判断文件是普通字段还是上传文件
            if(fileItem.isFormField()){


            }else{
                //上传文件项
                //获取上传文件名称
                String fileName = fileItem.getName();
                //上传文件
                fileItem.write(new File(file,fileName));
                //删除临时文件
                fileItem.delete();
            }
        }
        return "success";
        }
    /**
     * SpringMVC传统方式文件上传
     * @param
     * @return
     */
    @RequestMapping("/springFileupload")
    public String  springFileupload(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("springFileupload方法执行了...");
        //先获取要上传的文件目录
        String realPath = "H:\\updates";
        //创建file对象，一会儿向该路径下上传文件
        File file = new File(realPath);
        //首先判断该路径是否存在，如果不存在创建该路径
        if (!file.exists()) {
            file.mkdirs();
        }
        //获取上传文件名称
        String filename = upload.getOriginalFilename();
        //获取一个随机的且唯一的uuid
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //将文件的名称唯一化
        filename=  uuid+"_"+filename;
        //上传文件
        upload.transferTo(new File(file,filename));
        return "success";
    }

    /**
     * SpringMVC跨服务器方式进行上传文件
     * @return
     */
    @RequestMapping("/springFileupload1")
    public String springFileupload1(MultipartFile upload) throws Exception {
        System.out.println("springFileupload1方法执行了...");
        //定义图片服务器的请求路径
        String realPath = "http://localhost:9090/uploads/";

        //获取上传文件名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //把文件名称唯一化
        filename= uuid+"_"+filename;
        //向图片服务器上传文件
//        //创建客户端对象
//        Client client = Client.create();
//        //连接图片服务器
//        WebResource webResource = client.resource(realPath+filename);
//        //上传文件
//        webResource.put(upload.getBytes());
        // 创建客户端对象
        Client client = Client.create();
// 连接图片服务器
        WebResource webResource = client.resource(realPath+filename);
// 上传文件
        webResource.put(upload.getBytes());
        return "success";
    }
}
