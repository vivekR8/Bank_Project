import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String,User> userMap= new HashMap<>();
    Map<String,CreateAccount> accountMap= new HashMap<>();
    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }
}
