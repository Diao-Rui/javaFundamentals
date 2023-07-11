package javaSE.project.companyGammer;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 9:33
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: Position
 * @Description: TODO
 * @Version 1.0
 */
/*
 * 枚举类，有一个私有构造器
 * 所有的属性都是该枚举类的实例
 * 并且都是静态常量
 * */
public enum Position {
    EMPLOYEE("普通职员"),
    MECHANIC("技工"),
    ENGINEER("工程师"),
    MANAGE("经理"),
    PRESIDENT("总裁");
    private String name;

    private Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
