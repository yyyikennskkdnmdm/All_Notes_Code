package java_005_compare.compare_001_Comparable;

import org.testng.annotations.Test;

import java.util.Arrays;
// TODO 自然排序
public class Comparable_001_use_easy {


    @Test
    public void Comparable_001_use_easy_test_001(){
        Comparable_001_use_easy_Goods[] arr = new Comparable_001_use_easy_Goods[5];
        arr[0] = new Comparable_001_use_easy_Goods("lenovoMouse",34);
        arr[1] = new Comparable_001_use_easy_Goods("dellMouse",43);
        arr[2] = new Comparable_001_use_easy_Goods("xiaomiMouse",12);
        arr[3] = new Comparable_001_use_easy_Goods("huaweiMouse",65);
        arr[4] = new Comparable_001_use_easy_Goods("microsoftMouse",43);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}



class Comparable_001_use_easy_Goods implements  Comparable{

    private String name;
    private double price;

    public Comparable_001_use_easy_Goods() {
    }

    public Comparable_001_use_easy_Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明商品比较大小的方式:按照价格从低到高排序,再按照产品名称从高到低排序
    @Override
    public int compareTo(Object o) {
//        System.out.println("**************");
        if(o instanceof Comparable_001_use_easy_Goods){
            Comparable_001_use_easy_Goods goods = (Comparable_001_use_easy_Goods)o;
            //方式一：
//            if(this.price > goods.price){
//                return 1;
//            }else if(this.price < goods.price){
//                return -1;
//            }else{
////                return 0;
//                return this.name.compareTo(goods.name);
//            }
            //方式二：
           return Double.compare(this.price,goods.price);
        }
//        return 0;
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
