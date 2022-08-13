package mao.shallowClone;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.shallowClone
 * Class(类名): Citation
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 22:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Citation implements Cloneable
{
    private String name;

    /**
     * Instantiates a new Citation.
     *
     * @param name the name
     */
    public Citation(String name)
    {
        this.name = name;
    }

    /**
     * Instantiates a new Citation.
     */
    public Citation()
    {

    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Show.
     */
    public void show()
    {
        System.out.println(getName() + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException
    {
        return (Citation) super.clone();
    }
}
