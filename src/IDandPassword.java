import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPassword() {
        loginInfo.put("Bro","pizza");
        loginInfo.put("Brometheus","bro123");
        loginInfo.put("BroCode","PASSWORD");
    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
