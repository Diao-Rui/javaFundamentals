package javaSE.HighOOP.entity.circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 16:04
 * @PackageName:javaSE.HighOOP.entity.circle
 * @ClassName: CompareCircle
 * @Description: TODO
 * @Version 1.0
 */
public class CompareCircle extends Circle implements CompareObject {
    public CompareCircle(double radius) {
        super(radius);
    }

    /*
     * 判断连个原
     * */
    @Override
    public int compareTo(Object object) {
        if (this == object)
            return 0;
        if (object instanceof CompareCircle) {
            CompareCircle circle = (CompareCircle) object;
            //逻辑上讲是错误的
            //return (int) (this.getRadius() - circle.getRadius());
//            if(this.getRadius() > circle.getRadius()){
//                return 1;
//            }else if (this.getRadius() < circle.getRadius()){
//                return -1;
//            }else {
//                return 0;
//            }
            return Double.compare(this.getRadius(), circle.getRadius());
        }
        return 2;
    }
}
