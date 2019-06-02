package 创建型模式.FactoryMode.FactoryMethod;

/**
 * Created by hasee on 2018/11/27.
 */
public class appleGc implements Gc {
    @Override
    public Cp SC() {
        return new apple();
    }
}
