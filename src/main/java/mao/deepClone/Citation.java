package mao.deepClone;

import java.io.Serializable;

/**
 * Project name(项目名称)：java设计模式_原型模式
 * Package(包名): mao.deepClone
 * Class(类名): Citation
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 22:11
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Citation implements Cloneable, Serializable
{
    private Student student;

    /**
     * Instantiates a new Citation.
     */
    public Citation()
    {

    }

    /**
     * Instantiates a new Citation.
     *
     * @param student the student
     */
    public Citation(Student student)
    {
        this.student = student;
    }

    /**
     * Gets student.
     *
     * @return the student
     */
    public Student getStudent()
    {
        return student;
    }

    /**
     * Sets student.
     *
     * @param student the student
     */
    public void setStudent(Student student)
    {
        this.student = student;
    }

    /**
     * Show.
     */
    void show()
    {
        System.out.println(student.getName() + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException
    {
        return (Citation) super.clone();
    }
}
