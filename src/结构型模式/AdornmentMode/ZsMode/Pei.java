package 结构型模式.AdornmentMode.ZsMode;

import 结构型模式.AdornmentMode.BzsMode.Bing;

/**
 * Created by hasee on 2018/10/10.
 * 这是一个配料类（配料基础类）用来装饰Bing类（需要继承Bing）
 */
public abstract class Pei extends Bing{
    @Override
    public abstract String getName();
}
