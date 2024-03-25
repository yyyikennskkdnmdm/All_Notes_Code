# Java知识随手记



# 基础知识

栈：存放局部变量

堆：new出来的对象

方法区：类的加载信息、静态域、常量池



# 方法



**instanceof**

A instanceof B：判断A对象是否是B类的实例，同时如果A对象时B类的子类实例同样可以。













# API



**System**

```java
String javaVersion = System.getProperty("java.version");
String javaHome = System.getProperty("java.home");
String osName = System.getProperty("os.name");
String osVersion = System.getProperty("os.version");
String userName = System.getProperty("user.name");
String userHome = System.getProperty("user.home");
String userDir = System.getProperty("user.dir");

System.exit(0); // 退出执行
```





**scanner**

```java
Scanner scanner = new Scanner(System.in);
int i = scanner.nextInt();
System.out.println("i = " + i);
String s = scanner.nextLine();// 以空格为分割符
System.out.println("s = " + s);
String next = scanner.next();// 以回车为分隔符
System.out.println("next = " + next);
```





