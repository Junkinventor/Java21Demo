package 结构型模式.ProxyMode.StaticProxyMode;

/**
 * Created by hasee on 2018/12/25.
 */
public class Test {
    public static void main(String[] args) {
        RealStar realStar=new RealStar();
        ProxyStar proxyStar=new ProxyStar(realStar);
        proxyStar.sing();
    }
}
