package 结构型模式.ProxyMode.StaticProxyMode;

/**
 * Created by hasee on 2018/12/25.
 */
public class ProxyStar implements Star {

    //接口参数 Star 提高代码的灵活性

    private Star Star;

    ProxyStar(Star Star){
        this.Star=Star;
    }//因为代理模式中每个类都需要继承同一个接口 在实例化代理类时以接口为参数

    @Override
    public void confer() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void sing() {
        Star.sing();//获取到被代理类的sing方法
    }

    @Override
    public void collectMoney() {

    }
}
