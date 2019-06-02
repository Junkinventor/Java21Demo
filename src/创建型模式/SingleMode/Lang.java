package 创建型模式.SingleMode;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ProjectName: Java21Demo
 * @Package: 创建型模式.SingleMode
 * @ClassName: Lang
 * @Author: 废材
 * @Description: 使用懒汉模式实现单例
 * @Date: 2019/5/21 11:17
 * @Version: 1.0
 */

public class Lang implements Serializable {
    private static Lang lang;

    //防止反射破解
    private Lang() {
        if(lang!=null){
            throw new RuntimeException();
        }
    }

    //防止反序列化
    private Object readResolve() throws ObjectStreamException {
        return lang;
    }

    public static Lang getLang(){
        return new Lang();
    }


}
