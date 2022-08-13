package mao.deepClone;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.deepClone
 * Class(类名): CitationTest2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 22:23
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CitationTest2
{
    public static final String PATH = "./Citation.txt";

    public static void main(String[] args)
    {
        Citation citation1 = new Citation();
        Student student = new Student("张三", "北京");
        citation1.setStudent(student);
        //写到文件里
        System.out.println(CitationIO.write(citation1, PATH));
        //从文件里读
        Citation citation2 = CitationIO.read(PATH);
        assert citation2 != null;
        citation2.getStudent().setName("李四");
        //打印
        citation1.show();
        citation2.show();
        System.out.println(citation1);
        System.out.println(citation2);
        System.out.println(citation1.getStudent());
        System.out.println(citation2.getStudent());
        System.out.println(citation1 == citation2);
        System.out.println(citation1.getStudent() == citation2.getStudent());
    }
}
