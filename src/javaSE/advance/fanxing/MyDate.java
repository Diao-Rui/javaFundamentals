package javaSE.advance.fanxing;

/**
 * @Author Diao Rui
 * @Date 2023/6/27 11:29
 * @PackageName:javaSE.advance.fanxing
 * @ClassName: MyDate
 * @Description: TODO
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /*
     * 生日从小到大排序
     * */
    @Override
    public int compareTo(MyDate o) {
        int yearDistance = this.year - o.getYear();
        if (yearDistance != 0)
            return yearDistance;
        int monthDistance = this.month - o.getMonth();
        if (monthDistance != 0)
            return monthDistance;
        return this.day - o.getDay();
    }
}
