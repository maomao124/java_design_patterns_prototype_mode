package mao.test;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.test
 * Class(类名): PrototypeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class PrototypeTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        RealizeType realizeType1 = new RealizeType();
        System.out.println(realizeType1);
        RealizeType realizeType2 = realizeType1.clone();
        System.out.println(realizeType2);
        RealizeType realizeType3 = realizeType1.clone();
        System.out.println(realizeType3);
    }
}
