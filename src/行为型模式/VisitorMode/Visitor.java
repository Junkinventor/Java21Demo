package 行为型模式.VisitorMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 行为型模式.VisitorMode
 * @ClassName: Visitor
 * @Author: 废材
 * @Description: 访问者
 * @Date: 2019/2/22 21:21
 * @Version: 1.0
 */

public class Visitor implements IVisitor {
    @Override
    public void IvisitorTest(ConElement conElement) {
conElement.ElementTest();
    }
}
