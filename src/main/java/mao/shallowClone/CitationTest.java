package mao.shallowClone;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.shallowClone
 * Class(类名): CitationTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 22:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CitationTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Citation citation1 = new Citation("张三");
        //复制
        Citation citation2 = citation1.clone();
        citation2.setName("李四");
        Citation citation3 = citation2.clone();
        citation3.setName("王五");
        //显示
        citation1.show();
        citation2.show();
        citation3.show();
    }
}
