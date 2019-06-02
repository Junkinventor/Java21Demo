package 行为型模式.ObServerMode;

/**
 * Created by hasee on 2018/11/26.
 * 监视者用户
 */
public class userObserver implements Observer {
    private String name;
    private String text;
    //有参构造器  只要创建监视者就会被调用  命名会被添加到成员变量中
    public userObserver(String name) {
        this.name = name;
    }

    @Override
    //更改信息方法
    public void update(String xx) {
        this.text=xx;
        read();//调用read方法输出接收的消息
    }

    public  void read(){
        System.out.println(name+"  以接收信息--信息为："+text);
    }

}
