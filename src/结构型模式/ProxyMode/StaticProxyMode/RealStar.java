package 结构型模式.ProxyMode.StaticProxyMode;

/**
 * Created by hasee on 2018/12/25.
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void collectMoney() {

    }
}
