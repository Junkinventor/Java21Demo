package 行为型模式.VisitorMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 行为型模式.VisitorMode
 * @ClassName: Element
 * @Author: 废材
 * @Description: 一部分是本身的业务逻辑，另外就是允许接收哪类访问者来访问。
 * @Date: 2019/2/22 21:22
 * @Version: 1.0
 */
public interface Element {
    //允许接收的访问者类型
    void  ElementVisi(IVisitor iVisitor);

    //自身的业务逻辑
    void  ElementTest();
}
