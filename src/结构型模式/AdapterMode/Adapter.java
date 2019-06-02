package 结构型模式.AdapterMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.AdapterMode
 * @ClassName: Adapter
 * @Author: 废材
 * @Description: 适配器类
 * @Date: 2019/2/21 16:31
 * @Version: 1.0
 * 实现 ：因为适配器类继承了需要适配的类  所以二者的类型是相同的。
 */

public class Adapter implements Target {
   //方法一
    private Adapatee adapatee;

    public Adapter(Adapatee adapatee) {
        this.adapatee = adapatee;
    }


    /**
     * 着里有两种写法
     *    1、直接在class上继承Adaptee类（类适配器）
     *    2、通过组合的方式（对象适配器）
     */
    @Override
    public void AdapterEvent(){
        adapatee.ReadAdaptee();
    }
}

class Adapter2 extends Adapatee implements Target{

    @Override
    public void AdapterEvent() {
        this.ReadAdaptee();
    }
}