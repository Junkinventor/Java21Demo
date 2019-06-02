package 结构型模式.AdornmentMode.BzsMode;

/**
 *
 * Created by hasee on 2018/10/10.
 * 这是被装饰类的一个基本类
 * name :名字（属性）
 * jg（）；（表示价格的方法【抽象的】）
 * 使用抽象的目地是为了提高代码的复用性。//接口同样也可以实现。
 */

//由于bing是一个抽象类所以无法对它进行实例化。
    //在这里使用抽象类而不是接口的原因是因为需要添加参数的值和方法体
public abstract class Bing {
    public String name="这是一个普通的饼";

    public String getName() {
        return name;
    }
    public abstract int jg();
}
