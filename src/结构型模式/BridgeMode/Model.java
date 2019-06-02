package 结构型模式.BridgeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.BridgeMode
 * @ClassName: Model
 * @Author: 废材
 * @Description: 型号 产品
 * @Date: 2019/2/21 19:02
 * @Version: 1.0
 */

//作用： 它便是一个桥梁  连接了产品（抽象概念）和品牌和型号（具体概念）
public abstract class Model  {
    protected Brand brand;

    public Model(Brand brand) {
        this.brand = brand;
    }

    abstract void ModelID(Integer ID);

    abstract void ModelLX(String model);
}
