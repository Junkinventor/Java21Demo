package 创建型模式.FactoryMode.StaticFactoryMethod;

/**
 * Created by hasee on 2018/11/26.
 */
public class hamburgerClass extends hamburger{
    String name;
    int price;


    @Override
    public void Name(String Name) {
        this.name=name;
    }

    @Override
    public void Price(int price) {
        this.price=price;
    }

    //通过构造器为name，price赋值
    public hamburgerClass(String name, int price) {
        this.name = name;
        this.price = price;
    }



}
