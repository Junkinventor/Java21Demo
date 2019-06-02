package 创建型模式.BuilderMode;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2018/12/13.
 */
public class Test {
    public static void main(String[] args) {
        DirectorHero directorHero=new DirectorHero();
        Sti sti=directorHero.ccc(new HeroIn(),"岚");
        System.out.println(sti.toString());


        //new DirectorHero().ccc(new HeroIn(),"岚");


        HeroIn heroIn=new HeroIn();
        directorHero.bbb(heroIn,"岚");
        Sti zh = heroIn.ZH();
        System.out.println(zh.toString());

    }
}
