package 结构型模式.BridgeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.BridgeMode
 * @ClassName: Client
 * @Author: 废材
 * @Description: 测试类
 * @Date: 2019/2/21 19:11
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Brand brand=new BrandImpl();
        PcModel pcModel=new PcModel(brand);

        pcModel.ModelID(001);
        pcModel.ModelLX("PC");
        pcModel.Brand();
    }
}
