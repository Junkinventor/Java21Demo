package 结构型模式.AdapterMode;

/**
 * @ProjectName: Java21Demo
 * @Package: 结构型模式.AdapterMode
 * @ClassName: Client
 * @Author: 废材
 * @Description: 适配器  客户类
 * @Date: 2019/2/21 16:30
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {
       /* Client client=new Client();
        Adapatee adapatee=new Adapatee();
        Adapter adapter=new Adapter(adapatee);
        client.TestClient(adapter);*/

        new Client().TestClient(new Adapter(new Adapatee()));

        new Client().TestClient(new Adapter2());

        // 类适配器 new Client().TestClient(new Adapter());
    }
    public void TestClient(Target target){
        target.AdapterEvent();
    }
}
