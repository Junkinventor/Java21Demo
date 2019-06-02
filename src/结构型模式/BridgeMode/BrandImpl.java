package 结构型模式.BridgeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.BridgeMode
 * @ClassName: BrandImpl
 * @Author: 废材
 * @Description: 品牌的实际类
 * @Date: 2019/2/21 18:58
 * @Version: 1.0
 */

public class BrandImpl implements Brand{
    @Override
    public void BrandName(String name) {
        System.out.println("品牌"+name);
    }

    @Override
    public void BrandPrice(Integer Price) {
        System.out.println("价格"+Price);
    }
}
