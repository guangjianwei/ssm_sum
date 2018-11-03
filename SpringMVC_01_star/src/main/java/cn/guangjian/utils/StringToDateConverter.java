package cn.guangjian.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String,Date> {
    /**
     * 配置自定义转换数据，把相对应的yyyy-MM-dd的String类型转换成Date类型
     *   步骤：1.定义此类   2.再springmvc.XML里面进行自定义配置
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        if(source==null){
            throw new RuntimeException("请注入数据...");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("输入的数据有误，请重新输入！");
        }
    }
}
