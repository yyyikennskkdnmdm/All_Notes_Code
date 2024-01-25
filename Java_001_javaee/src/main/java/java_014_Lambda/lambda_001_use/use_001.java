package java_014_Lambda.lambda_001_use;

import org.testng.annotations.Test;
// Lambda的本质：如果一个接口，只声明了一个抽象方法，则此接口就成为函数式结构，我们可以在一个接口上使用@FunctionalInterface注解，这样做可以检查它是否是一个函数式接口
// 所以，以前用匿名实现类表示的，现在都可以用Lambda表达式
public class use_001 {

    // TODO 无参，无返回值
    @Test
    public void use_001_test_001(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("无参，无返回值");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("无参，无返回值 --> lambda");
        };

        r2.run();

    }
}
