package 创建型模式.BuilderMode;

/**
 * Created by hasee on 2018/12/13.
 */
public class DirectorHero {
    //使用接口为参数  使得类的多态性提升 复用性提高
       public Sti ccc(Hero hero,String E){
           //将对应的方法(组件)加载到实体类中
            hero.BuildE(E);
            hero.BuildF();
            hero.BuildQ();
            hero.BuildShift();
           //返回添加了信息的Sti实体类(组装好的)
          return  hero.ZH();
       }
    public void bbb(Hero hero,String E){
        //将对应的方法(组件)加载到实体类中
        hero.BuildE(E);
        hero.BuildF();
        hero.BuildQ();
        hero.BuildShift();
    }
}
