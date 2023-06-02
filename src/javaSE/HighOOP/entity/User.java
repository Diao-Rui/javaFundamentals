package javaSE.HighOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 15:54
 * @PackageName:javaSE.HighOOP.entity
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 */
public class User {
    private String username;
    private String password;
    private long registerTime;

    //使用代码块初始化
    {
        System.out.println("新用户注册");
        //获取当前系统时间，距离1970-1-1 0：0：0的时间
        registerTime = System.currentTimeMillis();
    }

    public User() {
        username = System.currentTimeMillis() + " ";
        password = "123456";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegisterTime() {
        return registerTime;
    }

    public String getInfo() {
        return "用户名='" + username + "', 密码='" + password + "', 注册时间=" + registerTime;
    }
}
