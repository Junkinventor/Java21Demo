package 结构型模式.AdornmentMode.SDian;

import 结构型模式.AdornmentMode.BzsMode.Bing;
import 结构型模式.AdornmentMode.BzsMode.KaoBing;
import 结构型模式.AdornmentMode.ZsMode.Dan;
import 结构型模式.AdornmentMode.ZsMode.SCai;

/**
 * Created by hasee on 2018/10/10.
 */
public class spDemo {

    void sp(){
        //被装饰者类
        Bing bb=new KaoBing();//bb中添加到了KaoBing的属性(指向内存的值)

        //为被装饰者添加装饰对象
        bb=new SCai(new Dan(new SCai(new SCai(bb))));



        //第二个饼
        Bing bb2=new Bing() {
            @Override
            public int jg() {
                return 0;
            }
        };
        bb2=new SCai(bb2);
        bb2=new Dan(bb2);


        System.out.println(bb.getName()+""+bb.jg());
        System.out.println("第二个饼"+"+"+bb2.getName()+bb2.jg());
    }

    public static void main(String[] args) {
        spDemo s=new spDemo();
        s.sp();
    }
}
