package 行为型模式.VisitorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java21Demo
 * @Package: 行为型模式.VisitorMode
 * @ClassName: ObjectStructure
 * @Author: 废材
 * @Description: 将需要访问的对象集中在 ObjectStructure 类中
 * @Date: 2019/2/22 21:39
 * @Version: 1.0
 */

public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();
    public void action(IVisitor iVisitor){
        for (Element element : elements) {
            element.ElementVisi(iVisitor);
        }

    }

    public void add(Element element){
        elements.add(element);
    }

}
