package 结构型模式.ProxyMode.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hasee on 2018/12/25.
 * 动态代理通过继承jdk定义的接口实现
 * 真实角色继承了接口  但是代理角色继承的是jdk的InvocationHandler接口
 *
 * 动态代理类  它并不是代理对象
 */
public class StarHandler implements InvocationHandler {

    Star star;

    //添加真实角色
    public StarHandler(Star star) {
        this.star = star;
    }

    /*调用InvocationHandler的invoke方法实现动态代理
     * 三个参数分别为 代理对象、执行方法、添加参数
     * 但是一般并不用向它传参数
     */

    //invoke方法是  invocationHandler接口中唯一的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //第一个参数：类型参数  第二个参数：方法需要的参数
        System.out.println("####");
        //在调用动态代理时  访问真实对象将默认调用本方法
        method.invoke(star,args);
        return null;
    }
}
