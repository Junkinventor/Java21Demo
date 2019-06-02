package 创建型模式.FactoryMode.StaticFactoryMethod;


/**
 * Created by hasee on 2018/11/26.
 */
public class MlHb extends hamburgerClass {


    public MlHb(String name,int price) {
        super(name, price);//调用父类的构造方法
          //子类会默认调用父类的构造方法  super调有参的
        System.out.println("类别-->"+name+"  "+"价格-->"+price);
    }

}
