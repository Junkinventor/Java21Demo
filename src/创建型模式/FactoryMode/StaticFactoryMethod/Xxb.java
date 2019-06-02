package 创建型模式.FactoryMode.StaticFactoryMethod;

/**
 * Created by hasee on 2018/11/26.
 */
public class Xxb extends hamburgerClass {
    String name;
    String price;
    public Xxb(String name, int price) {
        super(name, price);
        System.out.println("类别-->"+this.name+"  "+"价格-->"+this.price);
    }

}
