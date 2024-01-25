package java_006_Enum.Enum_001_use;

import org.testng.annotations.Test;

public class use_001 {

    @Test
    public void use_001_test_001(){
        use_001_Season1 summer = use_001_Season1.SUMMER;
        //toString():返回枚举类对象的名称
        System.out.println(summer.toString());

        System.out.println(use_001_Season1.SPRING);
        System.out.println(use_001_Season1.SPRING.getSeasonDesc());
    }

}
interface Info{
    void show();
}
enum use_001_Season1 implements Info{


    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    //2.声明Season对象的属性:private final修饰

    private final String seasonName;
    private final String seasonDesc;
    //2.私有化类的构造器,并给对象属性赋值

    private use_001_Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
//    //4.其他诉求1：提供toString()
//
//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


//    @Override
//    public void show() {
//        System.out.println("这是一个季节");
//    }
}
