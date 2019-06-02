package 结构型模式.ProxyMode.DynamicProxyDemo;

/**
 * Created by hasee on 2018/12/25.
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("csssssssssssss");
    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void sing() {
        System.out.println("cssssssssssss");
    }

    @Override
    public void collectMoney() {

    }
}
