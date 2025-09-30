package object;

public class SubscriberInfo {
    // 가입자 정보
    // 이름, 아이디(영어,숫자),비밀번호(영어,숫자,특수문자),전화번호(010-1234-1111)
    private String name;
    private String id;
    private String password;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // public void setPassword(String password) {
    // this.password = password;
    // }

    // public void setPhone(String phone) {
    // this.phone = phone;
    // }

    // 기능
    // 비밀번호 변경, 전화번호 변경
    // changePassword(변경할 비밀번호)
    // changePhone(변경할 전화번호)

    void changePassword(String chp) {
        this.password = chp;
    }

    void changPhone(String changeTel) {
        this.phone = changeTel;
    }

    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public SubscriberInfo(String name, String id, String password, String phone) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.phone = phone;
    }

}
