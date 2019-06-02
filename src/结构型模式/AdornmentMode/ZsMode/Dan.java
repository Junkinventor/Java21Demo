package 结构型模式.AdornmentMode.ZsMode;

import 结构型模式.AdornmentMode.BzsMode.Bing;

/**
 * Created by hasee on 2018/10/10.
 */
//由于pei是bian的子类  dan也是bian的子类
public class Dan extends Pei{
    private Bing bing;
//在实例化时使用Bing类型为参数
    public Dan(Bing bing) {
        this.bing = bing;
    }


    @Override
    public int jg() {
        System.out.println("Dan类中的bing对象指向的地址"+bing.toString());
        //为bian的jg加2
        return bing.jg()+2;
    }

    @Override
    public String getName() {
        return bing.getName()+"蛋";
    }
}
