package 行为型模式.VisitorMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 行为型模式.VisitorMode
 * @ClassName: ConElement
 * @Author: 废材
 * @Description:  实际元素类
 * @Date: 2019/2/22 21:24
 * @Version: 1.0
 */

public class ConElement implements Element {
    @Override
    public void ElementVisi(IVisitor iVisitor) {
        iVisitor.IvisitorTest(this);
    }

    @Override
    public void ElementTest() {
        System.out.println("实际元素类");
    }
}
