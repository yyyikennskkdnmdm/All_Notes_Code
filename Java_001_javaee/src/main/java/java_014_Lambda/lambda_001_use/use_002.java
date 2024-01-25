package java_014_Lambda.lambda_001_use;

import org.testng.annotations.Test;

import java.util.function.Consumer;

public class use_002 {

    // TODO Lambda 需要一个参数，但是没有返回值。
    @Test
    public void use_002_test_001(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");

        System.out.println("*******************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

    }



    // TODO 数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void use_002_test_002(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");

        System.out.println("*******************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

    }



    // TODO 语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void use_002_test_003(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");

        System.out.println("*******************");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("一个是听得人当真了，一个是说的人当真了");
    }

}
