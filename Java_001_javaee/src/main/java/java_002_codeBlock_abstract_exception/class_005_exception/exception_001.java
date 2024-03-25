package java_002_codeBlock_abstract_exception.class_005_exception;

import org.testng.annotations.Test;

/**
 * TODO 开发中如何选择使用try-catch-finally，还是throws
 *
 * 1.如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws
 *
 * 2.执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方法进行处理
 *      而执行的方法a可以考虑使用try-catch-finally的方式进行处理
 */
public class exception_001 {


    @Test
    public void exception_001_test_001() throws exception_001_myException {
        throw new exception_001_myException("这是我自己定义的一个异常类");
    }
}

class exception_001_myException extends Exception{
    static final long serialVersionUID = -3387516993124228888L;

    public exception_001_myException() {
    }

    public exception_001_myException(String message) {
        super(message);
    }
}
