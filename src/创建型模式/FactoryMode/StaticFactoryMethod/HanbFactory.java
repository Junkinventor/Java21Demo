package 创建型模式.FactoryMode.StaticFactoryMethod;

/**
 * Created by hasee on 2018/11/26.
 * 汉堡工厂
 */
public class HanbFactory {
    public static final  int xxb=1;//鲜虾堡
    public static final  int mlhb=2;//马拉脆鸡堡

    //使用静态可以直接类名.方法名进行调用
    public static hamburgerClass hanb(int i) {
        switch (i) {
            case xxb:
                return new Xxb("鲜虾堡", 5);

            case mlhb:
                return new MlHb("麻辣脆鸡堡", 10);

            default:
                return null;

        }
    }

}
