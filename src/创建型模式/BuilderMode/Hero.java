package 创建型模式.BuilderMode;

/**
 * Created by hasee on 2018/12/13.
 */
public interface Hero {
    /** 对应实体类中的属性*/
     void BuildE(String e);
     void BuildShift();
     void BuildQ();
     void BuildF();

    /**
     * 返回的为Sti类型 因为需要使用到实体类的set进行存储
     * */
     Sti ZH();
}
