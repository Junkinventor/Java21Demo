package 结构型模式.BridgeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.BridgeMode
 * @ClassName: PcModel
 * @Author: 废材
 * @Description: pc产品 继承 Model
 * @Date: 2019/2/21 19:05
 * @Version: 1.0
 */

public class PcModel extends Model{
//因为子类需要先经过父类的构造器才会经过子类的构造器当
//父类只有有参构造器时需要重写父类有参构造函数
    public PcModel(Brand brand) {
        super(brand);
    }

    @Override
    void ModelID(Integer ID) {
        System.out.println("型号="+ID);
    }

    @Override
    void ModelLX(String model) {
        System.out.println("类型="+model);

    }

    void Brand (){
       brand.BrandName("联想");
       brand.BrandPrice(2100);
    }
}


