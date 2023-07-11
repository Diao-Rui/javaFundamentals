package javaSE.advance.compare.comparable;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 14:31
 * @PackageName:javaSE.advance.compare.comparable
 * @ClassName: Phone
 * @Description: TODO
 * @Version 1.0
 */
//实现comparable接口，表示为一个可排序类
public class Phone implements Comparable {
    private String name;
    private double price;

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*
     * 重写comparable的方法
     * 返回0 正数 负数
     * 代表相同 第一个大 第二个大
     * 先根据价格排序，在根据名称排序
     * 如果想要降序，那就只需要在结果处加个-即可
     * */
    @Override
    public int compareTo(Object o) {
        if (o == this)
            return 0;
        if (o instanceof Phone) {
            Phone phone = (Phone) o;
            int compare = Double.compare(this.price, phone.price);
            if (compare == 0) {
                return this.compareTo(phone);
            } else {
                return compare;
            }
        }
        //主动抛出运行时异常
        throw new RuntimeException("类型不匹配");
    }
}
