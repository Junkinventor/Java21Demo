package 行为型模式.ObServerMode;

/**
 * Created by hasee on 2018/11/26.
 * 这是一个主题接口
 *
 * remove:移除观察者
 * register：添加观察者
 * notifyObserver：通知观察者
 *
 */
public interface Subject  {
    public void remove(Observer observer);
    public void register(Observer observer);
    public void notifyObserver();
    public void setText(String text);
}
