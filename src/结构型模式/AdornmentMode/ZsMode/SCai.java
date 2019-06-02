package 结构型模式.AdornmentMode.ZsMode;

import 结构型模式.AdornmentMode.BzsMode.Bing;

/**
 * Created by hasee on 2018/10/10.
 */
public class SCai extends Pei{
    private Bing bing;

    public SCai(Bing bing) {//获取到需要适配对象
        this.bing=bing;
    }

    @Override
    public String getName() {
        return bing.getName()+"生菜";
    }

    @Override
    public int jg() {
        System.out.println("SCai类 Bing的指向地址"+bing.toString());


        return bing.jg()+1;
    }
}
