package 蓝桥杯;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        A a = new A();
        a.method1();

        B b = new B();
        b.method1();


        Class<?> aClass = Class.forName("蓝桥杯.A");
        Constructor<?> constructor = aClass.getConstructor();
        A o = (A) constructor.newInstance();
        o.method1();
    }
}

class A{
    public A() {
    }

    public void method1(){
        System.out.println(1);
    }
}

class B extends A{
    @Override
    public void method1() {
        super.method1();
    }
}