package 行为型模式.VisitorMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 行为型模式.VisitorMode
 * @ClassName: Client
 * @Author: 废材
 * @Description: 测试类
 * @Date: 2019/2/22 21:47
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
        //将元素类对象  集中存储到list集合中进行保存
        ObjectStructure objectStructure=new ObjectStructure();
        objectStructure.add(new ConElement());
        objectStructure.add(new ConElement());


        //通过访问者对象 读取list集合中的类对象
        IVisitor iVisitor=new Visitor();
        objectStructure.action(iVisitor);
    }
}
