package 行为型模式.ObServerMode;

import java.util.ArrayList;

/**
 * Created by hasee on 2018/11/26.
 * 主题服务器
 */
public class ServerSubjet implements Subject{
    String text;

    //设置动态数组（用来存储观察者的数量）
    //动态数组的长度是不确定的无法使用length()方法

    private ArrayList<Observer> Observec;

/** 构造器中创建动态数组*/
    public ServerSubjet() {
        Observec=new ArrayList();
    }


    /**
     * ----移除观察者  限制参数必须是Observer类型的
     */
    @Override
    public void remove(Observer observer) {
        //通过indexOf查询数组中指定元素第一次出现的值
        int obsize= Observec.indexOf(observer);
        if(obsize>=0){//判断值是否存在
            Observec.remove(obsize);
        }
    }

    //添加观察者
    /**
     * register  添加观察者
     */
    @Override
    public void register(Observer observer) {
        Observec.add(observer);
    }


    @Override
    public void notifyObserver() {
        //通知所有观察者
        for (int i=0; i<Observec.size();i++) {//回去数组的大小
            Observer obser =  Observec.get(i);//将查到的对象先放在Observer（观察者中）
            //userObserver obser2= (userObserver) Observec.get(i);
            obser.update(text);//通知相应的观察者

        }
    }

    public void setNotify(){
        notifyObserver();
    }


    //setText发送通知  且当它运行时会调用到notifyObserver方法通知所有监视器
    public void setText(String text){
        System.out.println("ServerSubject的setText方法"+"  "+text);
        this.text=text;
          setNotify();
    }


}
