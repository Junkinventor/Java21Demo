package 行为型模式.ObServerMode;

/**
 * Created by hasee on 2018/11/26.
 */
public class Test {
    public static void main(String[] args) {

        //创建主题对象
        Subject subObject=new ServerSubjet();


        //创建监视者对象
        Observer obsObject1=new userObserver("微信");
        Observer obsObject2=new userObserver("QQ");
        Observer obsObject3=new userObserver("IMS");



        //添加到Subject到数组中
        subObject.register(obsObject1);
        subObject.register(obsObject2);
        subObject.register(obsObject3);

        subObject.setText("装饰者模式接收消息");
        System.out.println("-------------------------------------------");
        //移除QQ接收
        subObject.remove(obsObject2);

        subObject.setText("第二次发送消息");

    }
}
