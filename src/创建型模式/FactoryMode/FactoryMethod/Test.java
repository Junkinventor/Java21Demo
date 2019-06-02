package 创建型模式.FactoryMode.FactoryMethod;

/**
 * Created by hasee on 2018/11/27.
 */
public class Test {
    public static void main(String[] args) {
        Cp oppo=new OppoGc().SC();
        Cp xiaomi=new XiaomiGc().SC();
        Cp apple =new appleGc().SC();
    }
}
