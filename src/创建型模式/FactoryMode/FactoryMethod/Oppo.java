package 创建型模式.FactoryMode.FactoryMethod;

/**
 * Created by hasee on 2018/11/27.
 */
public class Oppo implements Cp{
    String name;
    int price;

    Oppo(){
        name();
        price();
    }

    @Override
    public void name() {
       name="OPPO R11 ";
        System.out.print(name);
    }

    @Override
    public void price() {
         price=4999;
        System.out.println(price);
    }


}
