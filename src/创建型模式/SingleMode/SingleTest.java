package 创建型模式.SingleMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 创建型模式.SingleMode
 * @ClassName: SingleTest
 * @Author: 废材
 * @Description: 单例模式练习
 * @Date: 2019/3/24 9:10
 * @Version: 1.0
 */

public class SingleTest {
    public static void main(String[] args) {
        //使用枚举单例
        Enum.Singleton.INSTANCE.whateverMethod();
        Enum.Singleton.INSTANCE.whateverMethod2();
        Enum.SingLe.SINT.whateverMethod3();
    }
}

//懒汉模式 在调用到Ehan方法时才会创建实例化对象 --不推荐使用
class Lhan{
   private static Lhan Lhan;

    private Lhan(){

    }

    public static synchronized Lhan getEhan() {
        if (Lhan == null) {
            return new Lhan();
        }
        return Lhan;
    }
}

//饿汉模式 在Ehan类加载时便将对象创建出来  问题：会无端的浪费内存  因为在类加载时便创建对象这将解决线程问题
class Ehan{
    private static Ehan ehan=new Ehan();

    private Ehan(){

    }
    public static Ehan getEhan() {
        return ehan;
    }
}

//Enum类型创建
class Enum{
    public enum Singleton {
        INSTANCE;
        public void whateverMethod() {
        }
        public void whateverMethod2(){

        }

    }
    public enum SingLe{
        SINT;
        public void whateverMethod3(){

        }
    }
}
