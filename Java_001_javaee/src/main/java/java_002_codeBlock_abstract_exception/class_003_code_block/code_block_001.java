package java_002_codeBlock_abstract_exception.class_003_code_block;

import lombok.Data;
import org.testng.annotations.Test;

/**
 * 代码块的使用
 */
// TODO 作用：初始化类的信息
    // TODO:静态代码块的使用实例--->JDBCUtil
@Data
class code_block_001_a{
    int a;
    static int b = 2;

    // TODO 非静态代码块
    // 静态代码块 的执行要先于 非静态代码块
    {
        // 随着对象的创建而执行
        System.out.println("code block");

        // 非静态代码块中可以调用静态属性、方法，以及非静态的属性和方法
        a = 1;
        b = 3;
    }

    // TODO 静态代码块
    static {
        // 随着类的加载而执行
        System.out.println("static code block");

        // 静态代码块中只能调用静态属性和方法
//        a = 2;
        b = 4;
    }

    @Override
    public String toString() {
        return "code_block_001_a{" +
                "a=" + a + ", b=" + b +
                '}';
    }
}

public class code_block_001 {

    @Test
    public void code_block_001_test_001(){
        code_block_001_a code_block_a = new code_block_001_a();
        System.out.println(code_block_a);
    }


}



