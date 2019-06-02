package 创建型模式.FactoryMode.FactoryMethod;

/**
 * Created by hasee on 2018/11/27.
 */
public class XiaoMi implements Cp {
    String name;
    int price;
    @Override
    public void name() {
        name="小米6";
    }

    @Override
    public void price() {
        price=2699;
    }

    public XiaoMi() {
        price();
        name();
        System.out.println(name+" "+price);
    }
}
