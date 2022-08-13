package mao.test;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.test
 * Class(类名): RealizeType
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RealizeType implements Cloneable
{
    public RealizeType()
    {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
