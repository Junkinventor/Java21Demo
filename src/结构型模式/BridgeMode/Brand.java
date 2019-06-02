package 结构型模式.BridgeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.BridgeMode
 * @ClassName: Brand
 * @Author: 废材
 * @Description: 品牌接口（抽取出来的共性）
 * @Date: 2019/2/21 18:57
 * @Version: 1.0
 */
public interface Brand {
    //名字
    void BrandName(String name);

    //价格
    void BrandPrice(Integer Price);
}
