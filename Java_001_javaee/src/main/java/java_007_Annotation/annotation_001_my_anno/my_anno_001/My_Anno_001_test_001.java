package java_007_Annotation.annotation_001_my_anno.my_anno_001;

import java.lang.annotation.*;
import java.util.ArrayList;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;

public class My_Anno_001_test_001 {
    public static void main(String[] args) {
        Person person = new Person();
        Generic<MyAnnotations> myAnnotationsGeneric = new Generic<>();
    }
}
@MyAnnotation(value="hi")
@MyAnnotation(value="abc")
class Person{
    private String name;
    private int age;

    public Person() {
    }
    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation
    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}


class Generic<@MyAnnotation T>{

    public void show() throws @MyAnnotation RuntimeException{

        ArrayList<@MyAnnotation String> list = new ArrayList<>();

        int num = (@MyAnnotation int) 10L;
    }

}


//TODO 被修饰的注解具有继承性
@Inherited
// TODO 可重复注解
//  在MyAnnotation上声明@Repeatable，成员值为MyAnnotations.class
//  MyAnnotation的Target和Retention等元注解与MyAnnotations相同
@Repeatable(MyAnnotations.class)
// 指定所修饰注解的生命周期
// Source 、 class 、 runtime，只有声明为runtime声明周期的注解，才能通过反射获取
@Retention(RetentionPolicy.RUNTIME)
// 用于指定被修饰的注解在被javadoc解析时，保留下来
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
// TODO 类型注解：
//  TYPE_PARAMETER:表示该注解能写在类型变量的声明语句中（如：泛型声明）
//  TYPE_USE：表示该注解能写在使用类型的任何语句中。
    // @Documented：所修饰的注解在javadoc中生成文档
@interface MyAnnotation{
    String value() default "default";
}
@Inherited
@Retention(RetentionPolicy.RUNTIME)

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@interface MyAnnotations{
    MyAnnotation[] value();
}

interface Info{
    void show();
}

class Student extends Person implements Info{

    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    public void show() {

    }
}