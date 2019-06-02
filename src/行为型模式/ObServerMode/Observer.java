package 行为型模式.ObServerMode;

/**
 * Created by hasee on 2018/11/26.
 * 这是一个观察者接口
 *
 * update:当主题调用notifyObserver方法时，观察update方法会被回调
 */
public interface Observer {
    public void  update(String xx);
}
