package 创建型模式.BuilderMode;

/**
 * Created by hasee on 2018/12/13.
 */
public class HeroIn implements Hero {

    Sti sti;
    public HeroIn() {//通过构造器默认去加载实体类对象
        this.sti=new Sti();
    }

    /** 为实体类设置存储的值*/
    @Override
    public void BuildE(String e) {
        sti.setE(e);
    }

    @Override
    public void BuildShift() {
        sti.setShift("Shift");
    }

    @Override
    public void BuildQ() {
        sti.setQ("Q");
    }

    @Override
    public void BuildF() {
        sti.setF("F");
    }


    /** 将赋值了的实体类返回*/
    @Override
    public Sti ZH() {
            return sti;
    }

}
