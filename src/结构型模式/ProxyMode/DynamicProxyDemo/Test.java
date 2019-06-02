package 结构型模式.ProxyMode.DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hasee on 2018/12/25.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取真实角（真实角色）
        Star star=new RealStar();


        //代理角色（代理角色）
        InvocationHandler starHandler=new StarHandler(star);


        //ClassLoader.getSystemClassLoader()：获取当前类加载器 目的：使用他的类加载器来加载动态代理对象
        // new Class[]{Star.class} 保存类的.class文件  可以有多个  目的：通过反射获取类的接口将它叫给代理对象
        //starHandler 添加代理角色

        //获取到代理角色的类加载器
        ClassLoader classLoader = Class.forName("结构型模式.ProxyMode.DynamicProxyDemo.StarHandler").getClassLoader();


        //代理对象star1
        Star star1=(Star)Proxy.newProxyInstance(
                                                classLoader,
                                                new Class[]{Star.class},
                                                starHandler
                                                           );
        //所有掉用到代理角色的方法都将 自动跳转到StarHandler类中的invoke再去RealStar（真实角色）运行相应的方法
        star1.sing();
        star1.confer();
        star1.bookTicket();
    }
}
