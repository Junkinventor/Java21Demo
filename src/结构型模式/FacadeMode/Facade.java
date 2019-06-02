package 结构型模式.FacadeMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.FacadeMode
 * @ClassName: Facade
 * @Author: 废材
 * @Description: 门面类
 * @Date: 2019/2/18 16:20
 * @Version: 1.0
 */
public class Facade {
    void facade(){
        Boiledwater boiledwater = new Boiledwaterr();

        Tea teaa = new Teaa();

        boiledwater.boiledwater();
        teaa.tea();
    }
}
