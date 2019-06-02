package 结构型模式.AdornmentMode.BzsMode;

/**
 * Created by hasee on 2018/10/10.
 */
//它继承了bing类  可以通过父类来实例化子类
public class KaoBing extends Bing{
    public KaoBing() {
        //调用父类的属性并重新赋值
       name="烤饼";
    }

    @Override
    public int jg() {
        //返回一个烤饼的价格
        return 4;
    }
}
